package BazaDanychSklepu;

public class OfertaProduktu {
    private Oferta daneOferty;
    private Promocja danePromocji;

    public OfertaProduktu(Oferta daneOferty) {
        this.daneOferty = daneOferty;
    }

    public Oferta getDaneOferty() {
        return daneOferty;
    }

    public Promocja getDanePromocji() {
        return danePromocji;
    }

}
