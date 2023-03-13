package Ders28_Deneme;

import Ders28_Access_Modifier_Inheritance.C03_EncapsuleDatalar;

public class EncapsuletionKullanimi {
    public static void main(String[] args) {

        System.out.println(C03_EncapsuleDatalar.getIsim()); // Yildiz Pazarlama

        C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);


       //System.out.println("Toplam satıs : " + obj.toplamSatis); // 600

        //obj.toplamSatis= 600000;

    }
}


/*
    C03_EnkapsuleDatalar classındaki isim variable inin
    degeri gorunsun ama degistirilmesin.
    satısTutari ise deger girebilsin ama girilen degerler sonradan degistirilsin

    Eger bir variable icin read veya write ozelliklerinin birbirinden
    ayrilmasi isteniyorsa oncelikle access modifier ile
    kimsenin ulasamamasını saglayın

    Private yaparak kimsenin ulasamayacagını garantiye aldiktan sonra

    READ yetkisi vermek istediklerimiz icin getter() methodu
    WRİTE yetkisi vermek istediklerimiz icin setter() olusturmalıyız
 */