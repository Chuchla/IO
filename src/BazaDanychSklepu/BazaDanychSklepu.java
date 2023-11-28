package BazaDanychSklepu;

import java.util.ArrayList;

public class BazaDanychSklepu {
    private ArrayList<Oferta> listaOfert;

    public void usunOferte(Oferta oferta) {
        int index = wyszukajOferte(oferta);
        if (index != -1) {
            listaOfert.remove(index);
        } else {
            throw new RuntimeException("Nie można usunąć oferty, nie ma jej w bazie sklepu");
        }
    }

    public void usunPromocje(Oferta oferta) {
        listaOfert.get(wyszukajOferte(oferta)).usunPromocje();
    }

    public void dodajPromocje(Oferta oferta, Promocja promocja) {
        listaOfert.get(wyszukajOferte(oferta)).dodajPromocje(promocja);
    }

    int wyszukajOferte(Oferta oferta) {
        return listaOfert.indexOf(oferta);
    }
}
