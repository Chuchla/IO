package BazaDanychMagazynu;

import java.util.ArrayList;

public class Zamowienie {
    private int idZamowienia;
    private float kwota;
    private ArrayList<Produkt> zamowioneTowary;
    private StanZamowienia stanZamowienia;

    public Zamowienie(int idZamowienia, float kwota, ArrayList<Produkt> zamowioneTowary, StanZamowienia stanZamowienia) {
        this.idZamowienia = idZamowienia;
        this.kwota = kwota;
        this.zamowioneTowary = zamowioneTowary;
        this.stanZamowienia = stanZamowienia;
    }

    public Zamowienie(StanZamowienia stanZamowienia) {
        this.stanZamowienia = stanZamowienia;
    }

    public void setStanZamowienia(StanZamowienia stanZamowienia) {
        this.stanZamowienia = stanZamowienia;
    }

    public ArrayList<Produkt> getZamowioneTowary() {
        return zamowioneTowary;
    }

    public StanZamowienia getStanZamowienia() {
        return stanZamowienia;
    }

    public float getKwota() {
        return kwota;
    }

    public int getIdZamowienia() {
        return idZamowienia;
    }
}
