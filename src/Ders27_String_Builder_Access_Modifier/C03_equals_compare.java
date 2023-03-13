package Ders27_String_Builder_Access_Modifier;

public class C03_equals_compare {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java");
        StringBuilder sb2= new StringBuilder("Java");
        String str="Java";


        System.out.println(sb1==sb2);
        System.out.println(sb1==sb1);

        System.out.println(sb1.equals(sb2));

        /*
        StringBuilder da icerik ayni olsa bile equals method false doner.
        Cunku StringBuilder Class ında equals methodu yoktur.

         */


        System.out.println(sb1.compareTo(sb2)); // 0
        /*
        iki StringBuilder in içeriklerinin ayni oldugunu kontrol etmek için
        compareTo() kullanilir
         */

        StringBuilder sb3= new StringBuilder("Haza");
        StringBuilder sb4= new StringBuilder("Tava");

        System.out.println(sb1.compareTo(sb3)); // -2
        System.out.println(sb1.compareTo(sb4)); // -10
        System.out.println(sb3.compareTo(sb4)); // -12

        /*
        CompateTo methodu karşılaştırılan StringBuilder lar ayni metne
        sahipse 0 döner

        ayni degilse, bastan itibaren kontrole baslar.
        farkli olan ilk harfin karşılaştırılan kelimedeki ayni index deki
        harften kac harf ilerde oldugunu dondurur.
         */
    }
}
