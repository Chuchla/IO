package BazaDanychMagazynu;

public class Produkt {
    static private int licznik = 0;
    private int idPozycjiWMagazynie;
    private int iloscNaStanie;
    private int iloscSprzedanych;
    private int idProduktuProducenta;

    public Produkt(int iloscSprzedanych, int idProduktuProducenta) {
        this.idPozycjiWMagazynie = ++licznik;
        this.iloscSprzedanych = iloscSprzedanych;
        this.idProduktuProducenta = idProduktuProducenta;
    }

    public int getIdPozycjiWMagazynie() {
        return idPozycjiWMagazynie;
    }

    public int getIloscNaStanie() {
        return iloscNaStanie;
    }

    public int getIloscSprzedanych() {
        return iloscSprzedanych;
    }

    public int getIdProduktuProducenta() {
        return idProduktuProducenta;
    }

    public void setIloscNaStanie(int iloscNaStanie) {
        this.iloscNaStanie = iloscNaStanie;
    }
}
