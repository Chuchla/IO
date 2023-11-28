import BazaDanychMagazynu.BazaDanychMagazynu;
import BazaDanychMagazynu.Zamowienie;
import BazaDanychMagazynu.StanZamowienia;
public class realizacjaZwrotuReklamacji {
        private BazaDanychMagazynu bazaDanychMagazynu;

    public realizacjaZwrotuReklamacji(BazaDanychMagazynu bazaDanychMagazynu) {
        this.bazaDanychMagazynu = bazaDanychMagazynu;
    }
    private void realizacjaNowegoZamowienia(Zamowienie zamowienie){
        bazaDanychMagazynu.realizacjaNowegoZamowienia(zamowienie);
    }
    private void realizacjaZwrotuReklamacji(Zamowienie zamowienie, StanZamowienia stanZamowienia){
        bazaDanychMagazynu.realizacjaZwrotuReklamacji(zamowienie,stanZamowienia);
    }
}
