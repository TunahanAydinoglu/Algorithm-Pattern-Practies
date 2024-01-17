package odev2;

public class Kasar implements Peynir {

    @Override
    public void peynirHazirla() {
        System.out.println("Kasar hazırlanıyor");
    }

    public Kasar(){
        peynirHazirla();
        System.out.println("Pizzaya kasar eklendi");
    }
}
