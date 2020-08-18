package odev2;

public class IspartaPizzaMalzemeFactory implements PizzaMalzemeFactory {

    @Override
    public void hamurYap() {
        UstuAcikHamur ustuAcikHamur = new UstuAcikHamur();
    }

    @Override
    public void peynirEkle() {
        Kasar kasar = new Kasar();
    }

    @Override
    public void etEkle() {
        Kiyma kiyma = new Kiyma();
    }
}
