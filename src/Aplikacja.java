import BazaDanychMagazynu.BazaDanychMagazynu;
import BazaDanychSklepu.BazaDanychSklepu;

public class Aplikacja {
    private BazaDanychSklepu bazaDanychSklepu;
    private BazaDanychMagazynu bazaDanychMagazynu;
    ModyfikujOferte modyfikujOferte;

    public Aplikacja(BazaDanychSklepu bazaDanychSklepu, BazaDanychMagazynu bazaDanychMagazynu) {
        this.bazaDanychSklepu = bazaDanychSklepu;
        this.bazaDanychMagazynu = bazaDanychMagazynu;
    }
}
