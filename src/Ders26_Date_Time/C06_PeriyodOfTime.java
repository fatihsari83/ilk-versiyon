package Ders26_Date_Time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class C06_PeriyodOfTime {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1983,1,1);
        LocalDate bugun= LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun));// P40Y2M8D

        System.out.println("Yas :" + Period.between(dogumTarihi, bugun).getYears());


    }
}
