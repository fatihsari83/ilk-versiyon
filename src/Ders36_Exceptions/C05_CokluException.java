package Ders36_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_CokluException {
    public static void main(String[] args) {

        String str = "Java her gecen gun guzellesiyor";
        int[] arr = {3, 4, 5, 6, 7};

        // kullanicidan 0 veya pozitif bir tam sayi isteyin
        // girilen degeri index olarak kullanip
        // str ve arr nin o index indeki elemanlari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Index olarak kullanmak icin 0 veya positif bir tam sayi girin");

        /*
            Birbirinden bagımsız 3 farklı turde exception riski var
            bunlari farkli sekillerde handle edebiliriz
            1- herbiri ayri ayri try-catch yapariz.
            2- tek bir tryi birden fazla catch yapabilirsiniz.
         */
        try {
            int index = scan.nextInt();

            System.out.println(str.charAt(index)); // ArrayIndexOutOfBoundsException

            System.out.println(arr[index]); // .StringIndexOutOfBoundsException

        } catch (RuntimeException e) {
            //System.out.println("giris hatali olabilir, ");
            e.printStackTrace();

            // biz mesaj yazacaksak genel bir mesaj yazabiliriz veya
            // javanın hata kodlarini yazdirabiliriz
        }


        try {
            int index = scan.nextInt();

            System.out.println(str.charAt(index)); // ArrayIndexOutOfBoundsException

            System.out.println(arr[index]); // .StringIndexOutOfBoundsException

        } catch (InputMismatchException e) {
            System.out.println("Tam sayi girmelisin");
        } catch (StringIndexOutOfBoundsException e) {
            ;
            System.out.println("Girilen index String sınırlari disinda");

        } catch (ArithmeticException e) {
            System.out.println("Girilen index Array sinirlari dısında");
        }
    }
}
