package Ders36_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanicininGirdigiDegerleriToplama {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar tamsayi alip toplayin
        // kullanici Q ya bastıgında islemi sonlandirip
        // kac sayi girildigini ve toplamini yazdirin
        // q veya Q dısında tamsayi olmayan bir deger girilirse
        // hata mesajı verip, yeni deger isteyerek isleme devam edin.

        int sayac=0;
        int toplam=0;
        int girilenSayi=0;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("toplanmak uzere tam sayi giriniz \nBitirmek icin q'ya basin");

            try {

                girilenSayi= scan.nextInt();// q,Q veya gecersiz baska input girerse exception olusur
                toplam+=girilenSayi;
                sayac++;

            } catch (InputMismatchException e) {

                char input = scan.next().charAt(0);

                if (input == 'q' || input =='Q'){
                    System.out.println("girilen " + sayac + " adet tamsayinin toplami : " + toplam);
                    break;
                }else {
                    System.out.println("Tamsayi degeri girmelisiniz");
                }

            }


        }while (true);

        System.out.println("Bu iş bu kadar");
    }
}
