package Ders25_Mutable_Immutable_Classes;

import java.time.LocalTime;

public class C05_Date_Time {
    public static void main(String[] args) {


        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 23:05:49.048241300

        System.out.println(saat.getNano()); // nano saniyeyi verir 386734000

        // bir loop ile 1 den 10000 e kadar olan sayilari toplayin
        // ve bu islemin kac nano saniye surdugunu bulun

        int toplam=0;

        int baslamaSuresiNano= saat.getNano();

        for (int i = 1; i < 10000; i++) {
            toplam +=i;

        }

        LocalTime saatSon= LocalTime.now();
        int bitisSuresiNano= saatSon.getNano();



        System.out.println("ıslem suresi : " + (bitisSuresiNano - baslamaSuresiNano));

    }
}
