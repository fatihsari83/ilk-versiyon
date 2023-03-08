package Ders13_Method_Olusturma;

import java.util.Scanner;

public class C06_Stringi_Terse_Cevirme_Metodu_Kullanma {
    public static void main(String[] args) {

        // Verilen bir String in Palindrome olup olmadıgını yazdirin
        // Palidrome: duzden ve tersten ayni sekilde yazilan
        // masam, 12321, kabak gibi

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");

        String metin= scan.nextLine();

        String tersmetin = C05_Stringi_Terse_Cevirme.stringTersineCevir(metin);

        if (metin.equals(tersmetin)){
            System.out.println("Girilen metin PALİDROME");
        }
        else {
            System.out.println("Girilen metin PALİDROME degil");
        }
    }
}
