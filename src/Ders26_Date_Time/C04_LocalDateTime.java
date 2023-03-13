package Ders26_Date_Time;

import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2023-03-09T21:52:43.048999100

        System.out.println(ldt.toLocalDate());
    }
}
