package Ders35_Interfaces;

import java.util.List;

public class C02_ChildOI01veI03 implements I01_Interface,I03_Interface{

    /*
    Interface in en onemli artisi bir classın birden fazla
    interface i implement edebilmesidir.

    Ancak birden fazla interface i implement ederken dikkar etmemiz
    gereken bir koonu vardir

    eger implement etmek istedigimiz farkli interface lerde
    ayni isimde fakat farkli return type i olan methodlar
    varsa iki method u ayni anda implement edemeyemecegimiz icin
    o iki interface den ancak birini implement edebiliriz.
     */
    @Override
    public void toplama() {

    }

    @Override
    public void cıkarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoryel() {
        return 0;
    }

    @Override
    public void bolme() {

    }

    public static void main(String[] args) {

        C02_ChildOI01veI03 obj = new C02_ChildOI01veI03();

        System.out.println(I01_Interface.str);
        System.out.println(I03_Interface.str);

        System.out.println(I02_Interfaces.str);


    }


}
