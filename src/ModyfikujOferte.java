import BazaDanychSklepu.BazaDanychSklepu;
import BazaDanychSklepu.Oferta;
import BazaDanychSklepu.Promocja;

public class ModyfikujOferte {
    private BazaDanychSklepu bazaDanychSklepu;

    public ModyfikujOferte(BazaDanychSklepu bazaDanychSklepu) {
        this.bazaDanychSklepu = bazaDanychSklepu;
    }
    private void dodajPromocje(Oferta oferta, Promocja promocja){
        try{
            bazaDanychSklepu.dodajPromocje(oferta, promocja);
        }catch(RuntimeException e){
            System.err.println(e.getMessage());
        }
    }
    private void usunPromocje(Oferta oferta){
        try{
            bazaDanychSklepu.usunPromocje(oferta);
        }catch(RuntimeException e){
            System.err.println(e.getMessage());
        }
    }
    private void usunOferte(Oferta oferta){
        try{
            bazaDanychSklepu.usunOferte(oferta);
        }catch(RuntimeException e){
            System.err.println(e.getMessage());
        }
    }
}
