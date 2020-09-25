public class Cay extends Icecek {
    String isim;

    Cay() {
        isim = "Çay";
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
