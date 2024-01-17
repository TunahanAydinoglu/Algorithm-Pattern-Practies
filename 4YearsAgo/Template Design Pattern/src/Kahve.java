public class Kahve extends Icecek {
    private String isim;

    Kahve() {
        isim = "Kahve";
    }

    @Override
    void demle() {
        System.out.println(isim + " demleniyor.");
    }

    @Override
    void icerikEkle() {
        System.out.println("Suya " + isim + " katılıyor.");
    }
}
