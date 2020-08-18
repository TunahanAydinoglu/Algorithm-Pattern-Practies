package odev2;

public class TokatPizzaMalzemeFactory implements PizzaMalzemeFactory {

    @Override
    public void hamurYap() {
        UstuKapaliHamur ustuKapaliHamur = new UstuKapaliHamur();
    }

    @Override
    public void peynirEkle() {
        Cokelek cokelek = new Cokelek();
    }

    @Override
    public void etEkle() {
        Sucuk sucuk = new Sucuk();
    }
}
