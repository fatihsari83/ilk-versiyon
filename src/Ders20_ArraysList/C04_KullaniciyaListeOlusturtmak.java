package Ders20_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturtmak {
    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize
        // liste olarak dondurecek bir method olusturun

        System.out.println(kullaniciyaListOlusturtma());
    }

    public static List<String> kullaniciyaListOlusturtma () {

        List<String> isimler = new ArrayList<>();
        String girilenİsim = "";

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Listeye eklenmek için bir isim giriniz" +
                    "Bitirmek icin Q ya basin");
            girilenİsim = scan.nextLine();

            if (!girilenİsim.equalsIgnoreCase("q")) {
                isimler.add(girilenİsim);
            }

        } while (!girilenİsim.equalsIgnoreCase("q"));

        return isimler;

    }
}
