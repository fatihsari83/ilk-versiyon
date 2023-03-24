package Ders37_Throw_Keyword;

import java.util.Scanner;

public class C01_Throw_Keywords {
    public static void main(String[] args) {
        /*
         Kodlari yazarken bazen muhtemel bir durumda
         bazi kodlarin ignore edilmesi istenebilir.

         bu durumda kodlari ignore etme yontemi olarak
         isteyerek exception firlatip

         sonra da calismasini istedigimiz yerde
         catch ile yakalayip yolumuza devam edebiliriz


         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        try {
            if (yas <0){
                throw new IllegalArgumentException("Yas negatif olamaz");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
