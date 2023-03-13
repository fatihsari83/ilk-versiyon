package Ders26_Date_Time;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat1 = LocalTime.of(20,15);
        System.out.println(saat1);// 20:15


        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 20:53:06.228807700

        // LocalTime objesi olan saat variable si canli bir saat degildir.
        // olusturdugumuz andaki local time i sistemden alıp
        // kaydettiğimiz sabit bir değerdir.
        // kodun ilerleyen kısmında ne kadar süre gectigini gormek icin
        // saati yeniden almamiz gerekirse, yeni bir
        // LocalTime objesi daha olusturmaliyiz

        System.out.println(saat.getHour()); //18
        // get metodlari localTime objesinin saat,dakika,saniye ve nano
        // degerlerini bize getirir.

        System.out.println(saat.plusHours(2).plusMinutes(10));

        System.out.println(saat.minusMinutes(10).minusSeconds(10));

        System.out.println(saat.withSecond(10).withNano(20));

        System.out.println(saat.compareTo(saat1)); // ayni ise 0 döner

        System.out.println(saat.isAfter(saat1)); // true
        System.out.println(saat.isBefore(saat1)); // false

        System.out.println(saat.toSecondOfDay());

    }
}
