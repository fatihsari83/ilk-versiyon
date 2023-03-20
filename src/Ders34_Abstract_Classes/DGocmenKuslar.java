package Ders34_Abstract_Classes;

public class DGocmenKuslar extends BKuslar{

    /*
        Sadece ayırımı belirtmek ıcın abstract olmayan classlara
        CONCRETE denir

        1- abstract bir class
            parent ı olan abstract class daki
            abstract metodlari Implement
            etmek zorunda degildir.

            Isterse ımplement edip, concrete hale getirir.
            isterse yok eder.

        2- abstract bir silsileden sonra gelen
            ilk concrete class
            parent veya grandparent(s) olan
            abstract classlarda
            concrete yapilmayan tum abstract class lari
            IMPLEMENT ETMEK ZORUNDADIR.
     */


    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }
}
