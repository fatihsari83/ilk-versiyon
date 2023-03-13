package Ders28_Deneme;

import Ders28_Access_Modifier_Inheritance.C03_EncapsuleDatalar;

public class AccessModifierKullanimi {
    public static void main(String[] args) {

        C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();

        System.out.println(obj.a); // read yetkisi
        obj.a= 100; // write yetkisi

        //System.out.println(obj.satısTutari); // read yetkisi
        //obj.satisTutari= 100; // write yetkisi

        /*
            Başka bir variable veya method a ulaşöak istediğimizde

             - ulasmak ıstedıgımız class uyesinin static olup olmaması
               erişim yontemini etkiler
               static ise classIsmi.uyeIsmi yazarken
               static degilse obje olusturup objeIsmi.uyeIsmi

             - Ulasmak ıstedıgımız uyenın access modifieri ise o uyeye
             ulasıp ulasamayacagımız belirler.

             ulasabilirsek o datayı okuyabilir yada o datay yeni deger atayabiliriz


         */
    }


}
