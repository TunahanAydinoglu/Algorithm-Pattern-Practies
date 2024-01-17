package odev2;

public class Sucuk implements Et {

    @Override
    public void etHazirla() {
        System.out.println("Sucuk hazirlaniyor");
    }

    public Sucuk(){
        etHazirla();
        System.out.println("Pizzaya sucuk eklendi");
    }
}
