package BazaDanychMagazynu;

public enum StanZamowienia {
    ZLOZONE("Zlozone"),
    PRZYJETE_DO_REALIZACJI("Przyjete do realizacji"),
    WYSLANE("Wyslane"),
    ZWROT_TOWARU("Zwrot towaru"),
    ZWROT_PIENIEDZY("Zwrot pieniedzy"),
    REKLAMACJA("Reklamacja");

    private final String stan;

    StanZamowienia(String stan) {
        this.stan = stan;
    }

    public String getStan() {
        return stan;
    }

}
