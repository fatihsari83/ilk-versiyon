package Ders15_While_Loop_D_While_Loop_Scope;

public class C06_ClassLevelVariable {

    /*
        Bir class icerisinde tum methodların erisebilecegi
        variabler istenirse Class Level da (Class in icinde
        ama methodlarin dısında) olusturulmalidir.

        1- Class Level da olusturulan variable larin
            scope u tum class dir.

        2-  Class level da olusturulan variable lara deger atanmasa bile
            Java onlar icin tanimlanmis DEFAULT DEGERLER atar.

        3-  Class level da olusturulan variable lar static
            veya instance(static olmayan) olabilir.

        4-  Static olarak tanımlanan variable lar tum metodlarda
            direkt kullanılabilir.

        5-  Metod static ise icerisine static olmayan hicbirsey almaz.
     */
    static  int sayi= 10;
    static String isim;
    static  boolean bl;
    static char chr;
    static int in;


    public static void main(String[] args) {
        System.out.println(sayi);
        System.out.println("String :" + isim); // non-primitive turler icin null
        System.out.println("boolean :" + bl); // false
        System.out.println("char :" + chr); // " hiclik"
        System.out.println("int :" + in); // sayisal turler icin 0
    }

    public static void sataicMetod(){
        sayi++;
        System.out.println(sayi);
    }
    public void staticOlmayanMethod(){
        sayi--;
        System.out.println(sayi);
    }
}
