public abstract class Icecek {
    String isim;

    Icecek(){}

    public void icecekHazirla(){
        suyuKaynat();
        icerikEkle();
        demle();
        bardagaKoy();

    }

    public void suyuKaynat(){
        System.out.println("Su kaynatılıyor.");

    }

    public void bardagaKoy(){
        System.out.println("İçecek bardağa konuyor.");
    }
    abstract void demle();
    abstract void icerikEkle();

}
