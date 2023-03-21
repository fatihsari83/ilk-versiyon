package Ders35_Interfaces;

import java.util.Scanner;

public class C04_Exceptions {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 5;

        System.out.println(sayi1 / sayi2);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi3 = 0;


        try {
            if (sayi3 == 0) {
                System.out.println("sifir giremezsiniz");
            } else {

                System.out.println(sayi1 / sayi3);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}