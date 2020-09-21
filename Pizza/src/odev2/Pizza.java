package odev2;

public class Pizza {

    void hazirla(String pizzaTuru) {

        if (pizzaTuru.equalsIgnoreCase("Tokat")){
            TokatPizzaMalzemeFactory tokatPizzaMalzemeFactory = new TokatPizzaMalzemeFactory();
            tokatPizzaMalzemeFactory.hamurYap();
            tokatPizzaMalzemeFactory.peynirEkle();
            tokatPizzaMalzemeFactory.etEkle();
            System.out.println("Tokat pizzası hazır, afiyet olsun");
        }
        else if (pizzaTuru.equalsIgnoreCase("Isparta")){
            IspartaPizzaMalzemeFactory ispartaPizzaMalzemeFactory = new IspartaPizzaMalzemeFactory();
            ispartaPizzaMalzemeFactory.hamurYap();
            ispartaPizzaMalzemeFactory.peynirEkle();
            ispartaPizzaMalzemeFactory.etEkle();
            System.out.println("Isparta pizzası hazır, afiyet olsun");
        }
        else
            System.out.println("Boyle bir pizza türümüz yok!");
    }
}
