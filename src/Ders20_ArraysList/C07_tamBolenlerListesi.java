package Ders20_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_tamBolenlerListesi {
    public static void main(String[] args) {

        // 6- Kullanicidan main metodda pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bolenleri bulunacak pozitif bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        System.out.println(pozitifBolenleriListele(girilenSayi));


    }

    public static List <Integer> pozitifBolenleriListele(int verilenSayi){ // 20

        List <Integer> pozitifBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <=verilenSayi; i++) {

            if (verilenSayi % i ==0){
                pozitifBolenlerListesi.add(i);
            }

        }
        return pozitifBolenlerListesi;

    }
}
