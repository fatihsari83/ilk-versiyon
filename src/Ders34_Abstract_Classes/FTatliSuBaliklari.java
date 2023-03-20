package Ders34_Abstract_Classes;

public class FTatliSuBaliklari extends EBalik{


    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }

    @Override
    public void yuzgec() {

    }

    @Override
    public void yasamAlani() {

    }

    @Override
    public void iskeletYapisi() {

    }

    public static void main(String[] args) {

      //  AHavyan hayvan = new AHayvan();
       // EBalik balik = new EBalik();
        AHavyan yayin = new FTatliSuBaliklari();

        /*
            abstract classlarin constract lari vardir
            ama obje olusturulamaz

            abstract classlar data turu secilip
            concrete child class larin constructor lari
            kullanilarak abstract parent class ozelliklerinde
            objeler olusturulabilir
         */
    }
}
