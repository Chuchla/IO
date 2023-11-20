package BazaDanychSklepu;

public class Oferta {

    final private int idOferty;
    final private String marka;
    final private String material;
    final private int kodProduktu;
    private float cena;
    private boolean czyNaPromocji;
    private Promocja promocja;

    public Oferta(Oferta daneOferty, int idOferty, String marka, String material, int kodProduktu, float cena) {
        this.idOferty = idOferty;
        this.marka = marka;
        this.material = material;
        this.kodProduktu = kodProduktu;
        this.cena = cena;
    }

    public void usunPromocje(){
        if(czyNaPromocji) {
            setPromocja(null);
            setCzyNaPromocji(false);
        }else{
            throw new RuntimeException("Oferta nie ma promocji, nie można usunąć prmocji")
        }

    }
    public void dodajPromocje(Promocja promocja){
        if(!czyNaPromocji){
            setPromocja(promocja);
            setCzyNaPromocji(true);
        }
        else{
            throw new RuntimeException("Oferta posiada promocje, nie można dodać nowej promocji");
        }
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public void setCzyNaPromocji(boolean czyNaPromocji) {
        this.czyNaPromocji = czyNaPromocji;
    }

    public void setPromocja(Promocja promocja) {
        this.promocja = promocja;
    }

    public int getIdOferty() {
        return idOferty;
    }

    public String getMarka() {
        return marka;
    }

    public String getMaterial() {
        return material;
    }

    public int getKodProduktu() {
        return kodProduktu;
    }

    public float getCena() {
        return cena;
    }

    public boolean isCzyNaPromocji() {
        return czyNaPromocji;
    }

    public Promocja getPromocja() {
        return promocja;
    }
}
