package Ders34_Abstract_Classes;

public class CAvciKuslar extends BKuslar{

    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    @Override
    public void omur() {
        System.out.println("Avcı kuslar ortalama 10 yil yasar");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        CAvciKuslar kartal = new CAvciKuslar();
        CAvciKuslar sahin = new CAvciKuslar();

        //BKuslar kus = new BKuslar();

        AHavyan baykus = new CAvciKuslar();
        baykus.hareket();
        baykus.solunum();
        baykus.omur();

    }
}
