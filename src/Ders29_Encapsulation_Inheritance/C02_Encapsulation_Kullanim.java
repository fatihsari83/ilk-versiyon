package Ders29_Encapsulation_Inheritance;

public class C02_Encapsulation_Kullanim {
    public static void main(String[] args) {


        C01 obj = new C01();

        obj.isim="Melih"; // write
        System.out.println(obj.isim); // read


        obj.setSayi(40); // write
        System.out.println(obj.getSayi()); // read
        /*
            bir class uyesinin public olmasi ile private yapilip,
            getter ve sette method larinin olusturulmasi islevsel
            acıdan ayni sonucu olusturur.

            Bazi developer lar set(write) ve get(read) yetkilerinin kullanildigini
            vurgulamak icin 2. yontemi tercih ederler.
         */

    }
}
