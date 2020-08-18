package odev2;

public class UstuAcikHamur implements Hamur {

    @Override
    public void hamurHazirla() {
        System.out.println("Ustu acik hamur hazirlaniyor");
    }

    public UstuAcikHamur(){
        hamurHazirla();
        System.out.println("Ustu acik hamur hazirlandi");
    }
}
