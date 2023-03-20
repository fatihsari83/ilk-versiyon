package Ders34_Abstract_Classes;

public abstract class EBalik extends AHavyan{

    public void hareket (){
        System.out.println("Baliklar yuzerler");
    }

    public void solunum(){
        System.out.println("Baliklar solungac solunumu yapar");
    }
    public void cogalma (){
        System.out.println("Baliklar yumurta ile cogalir");
    }
    public abstract void yuzgec();
    public abstract void yasamAlani();
    public abstract void iskeletYapisi();
}
