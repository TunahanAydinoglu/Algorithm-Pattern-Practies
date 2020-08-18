package odev2;

public class Cokelek implements Peynir {

    @Override
    public void peynirHazirla() {
        System.out.println("Cokelek hazırlanıyor");
    }

    public Cokelek(){
        peynirHazirla();
        System.out.println("Pizzaya cokelek eklendi");
    }
}
