package BazaDanychSklepu;

public class Promocja {
    private String dataRozpcozeciaPromocji;
    private String dataZakonczeniaPromocji;
    private float wysokoscZnizki;
    private float najnizszaCenaSprzedPromocji;

    public Promocja(Oferta daneOferty, String dataRozpcozeciaPromocji, String dataZakonczeniaPromocji, float wysokoscZnizki, float najnizszaCenaSprzedPromocji) {
        this.dataRozpcozeciaPromocji = dataRozpcozeciaPromocji;
        this.dataZakonczeniaPromocji = dataZakonczeniaPromocji;
        this.wysokoscZnizki = wysokoscZnizki;
        this.najnizszaCenaSprzedPromocji = najnizszaCenaSprzedPromocji;
    }
}
