package odev2;

public class UstuKapaliHamur implements Hamur {

    @Override
    public void hamurHazirla() {
        System.out.println("Ustu kapali hamur hazirlaniyor");
    }

    public UstuKapaliHamur(){
        hamurHazirla();
        System.out.println("Ustu kapali hamur hazirlandi");
    }
}
