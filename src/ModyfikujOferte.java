import BazaDanychSklepu.BazaDanychSklepu;
import BazaDanychSklepu.Oferta;
import BazaDanychSklepu.Promocja;

public class ModyfikujOferte {
    private BazaDanychSklepu bazaDanychSklepu;

    public ModyfikujOferte(BazaDanychSklepu bazaDanychSklepu) {
        this.bazaDanychSklepu = bazaDanychSklepu;
    }
    void dodajPromocje(Oferta oferta, Promocja promocja){
        bazaDanychSklepu.dodajPromocje(oferta, promocja);
    }
    void usunPromocje(Oferta oferta){
        bazaDanychSklepu.usunPromocje(oferta);
    }
    void usunOferte(Oferta oferta){
        bazaDanychSklepu.usunOferte(oferta);
    }
}
