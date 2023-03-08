package Ders13_Method_Olusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {

        // Kullanicidan 10 dan kucuk 2 pozitif tam sayi alıp
        // faktoryel degerlerini toplayın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk 2 adet pozitif tam sayi girin");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();


        int sonuc = C03_FaktoryelHesaplamaMethodu.faktoryelHesapla(sayi1)
                    + C03_FaktoryelHesaplamaMethodu.faktoryelHesapla(sayi2);

        System.out.println(sonuc);
    }
}
