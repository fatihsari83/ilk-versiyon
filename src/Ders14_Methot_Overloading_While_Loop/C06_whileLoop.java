package Ders14_Methot_Overloading_While_Loop;

import java.util.Scanner;

public class C06_whileLoop {
    public static void main(String[] args) {


        // kullanicidan toplanmak uzere sayilar alin
        // toplam 500 u asınca
        // kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan= new Scanner(System.in);

        int girilenSayi=0;
        int toplam=0;
        int girilensayiadedi=0;

        while (toplam <500){ // toplam 500 den kucuk oldugu sure boyunca
            System.out.println("Toplanmak uzere 1 tamsayi giriniz");

            girilenSayi= scan.nextInt();

            toplam += girilenSayi;
            girilensayiadedi++;

        }

        System.out.println("Toplam " + girilensayiadedi + " adet sayi girildi ve toplami :" + toplam);





    }
}
