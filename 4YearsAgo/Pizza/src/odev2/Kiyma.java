package odev2;

public class Kiyma implements Et {

    @Override
    public void etHazirla() {
        System.out.println("Kiyma hazirlaniyor");
    }

    public Kiyma(){
        etHazirla();
        System.out.println("Pizzaya kiyma eklendi");
    }
}
