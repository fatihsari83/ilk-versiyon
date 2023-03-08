package Ders14_Methot_Overloading_While_Loop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        /*
            Baslangıc ve bıtıs degeri belli olan
            veya kac kere tekrar edilecegi bilinen loop larda
            for loop ideal olarak kullanılabilir.

            Ancak tekrar sayisi belli olmayan
            baslangıc veya bitisi baska bir variable a
            bagli olan durumlarda for loop yerine
            while loop tercih edilir.
         */

        // 50 ve 100 arasindaki (sinirlar dahhil)
        // sayilari toplayin

        int toplam=0;

        for (int i = 50; i <=100 ; i++) {

            toplam +=i;

        }
        System.out.println("Toplam : " + toplam);

        // ayni soruyu while loop ile yapalim
        // for loop da 3 seyi takip ederiz
        // 1- baslangıc degeri
        // 2- bitis sarti
        // 3- artis ve azalis sekli

        toplam=0;
        int sayi=50;

        while (sayi <=100){
            toplam += sayi;

            sayi++; // 3825

        }


    }
}
