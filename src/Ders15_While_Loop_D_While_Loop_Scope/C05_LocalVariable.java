package Ders15_While_Loop_D_While_Loop_Scope;

public class C05_LocalVariable {
    public static void main(String[] args) {

        /*
            1-  bir metod icerisinde olusturulan variable nin
                scobe u o method dur. Baska methodda kullanilamaz.
                Bu variable lara LOCAL VARİABLE denir.
            2-  Her ne kadar bir metod icerisinde olsalar da
                Loop larin da ayri bir scope u vardir.
                Loop icerisinde olusturulan variable lar
                Loop dısında KULLANILAMAZLAR
            3-  Local variable lari deger atamadan olusturabiliriz.
                ancak deger atamadan kulanamayiz
         */

        String isim= "Ali Can";

        //sayi++;

        for (int i = 0; i < 10; i++) {
            int j= i+1;
        }
    }

    public static void baskaMethod(){

       // System.out.println(isim);
        int sayi=5;
    }
}
