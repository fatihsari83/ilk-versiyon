package Ders26_Date_Time;

import java.util.Arrays;

public class C08_varargs {
    public static void main(String[] args) {

        topla(3,4); //[3, 4]
        topla(3,4,5); // [3, 4,5]
        topla(3,4,5,6); // [3, 4, 5, 6]
        topla(1,2,3,4,5,6);
        topla(1,2,3,4,5,6,7,8,9);


    }
    public static void  topla(int... a ){

        System.out.println(Arrays.toString(a));

        int toplam=0;
        for (int each:a
             ) {
            toplam += each;
        }
        System.out.println("Toplam : " + toplam);
    }

    /*
        Java da bir method parametrelerine uygun argumente sahip method
        call oldugunda calisir.

        Ornegin 2 int paranetre varsa
        sadece 2 int argument ile method call yapildiginda calisir

        Java ayni data turune sahip olmak sartıyla
        parametre sayisini esnek tuatabilmek icin vararga olusturmustur.

        Varargs bir ARRAY dir.

        dolayısıyla method da array elementlerini
        istedigimiz isleme
     */
}
