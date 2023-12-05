package BazaDanychMagazynu;

import java.util.ArrayList;

public class BazaDanychMagazynu {
    private ArrayList<Produkt> listaAsortymentu;

    private Produkt WyszukajTowar(int idPozycjiWMagazynie) {
        for (Produkt produkt : listaAsortymentu) {
            if (produkt.getIdPozycjiWMagazynie() == idPozycjiWMagazynie) {
                return produkt;
            }
        }
        //throw new RuntimeException("Produkt nie istnieje w bazie Asortymentu");
        return null;
    }

    private int sprawdzStan(Produkt produkt) {
        try {
            return WyszukajTowar(produkt.getIdPozycjiWMagazynie()).getIloscNaStanie();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    private void uzupelnienieMagazynu(Produkt produkt, int iloscTowaru) {
        int idProduktu = produkt.getIdPozycjiWMagazynie();
        int iloscNaStanie = produkt.getIloscNaStanie();
        if (WyszukajTowar(idProduktu) != null) {
            WyszukajTowar(idProduktu).setIloscNaStanie(iloscNaStanie + iloscTowaru);
        } else {
            produkt.setIloscNaStanie(iloscTowaru);
            listaAsortymentu.add(produkt);
        }
    }

    private void pobierzProduktZMagazynu(ArrayList<Produkt> produkty) {
        for (Produkt produkt : produkty) {
            WyszukajTowar(produkt.getIdPozycjiWMagazynie()).setIloscNaStanie(produkt.getIloscNaStanie() - 1);
        }
    }

    private void wyslanieZamowienia(Zamowienie zamowienie) {
        zamowienie.setStanZamowienia(StanZamowienia.WYSLANE);
    }

    public void realizacjaNowegoZamowienia(Zamowienie zamowienie) {
        try {
            pobierzProduktZMagazynu(zamowienie.getZamowioneTowary());
            wyslanieZamowienia(zamowienie);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    private float zwrotPieniedzy(Zamowienie zamowienie) {
        return zamowienie.getKwota();
    }

    public void realizacjaZwrotuReklamacji(Zamowienie zamowienie, StanZamowienia reklamacjaZwrot) {
        zamowienie.setStanZamowienia(reklamacjaZwrot);
        if (zamowienie.getStanZamowienia() == StanZamowienia.REKLAMACJA) {
            pobierzProduktZMagazynu(zamowienie.getZamowioneTowary());
            wyslanieZamowienia(zamowienie);
        } else if (zamowienie.getStanZamowienia() == StanZamowienia.ZWROT_TOWARU) {
            for (Produkt produkt : zamowienie.getZamowioneTowary()) {
                uzupelnienieMagazynu(produkt, 1);
            }
            zwrotPieniedzy(zamowienie);

        } else {
            throw new RuntimeException("Nieobslugiwany stan zamowienia. Mozliwy REKLAMACJA/ZWROT_TOWARU");
        }
    }
}
