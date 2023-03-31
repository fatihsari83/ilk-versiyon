package Ders39_Maps;

import java.util.Map;

public class C02_Maps {
    public static void main(String[] args) {

        Map<Integer,String> okulMap=MapMethodDepo.ornekMapOlustur();

        okulMap.put(110,"Kerem-Umut-12-K-MF");

        System.out.println(okulMap.keySet()); // [101, 102, 103, 104, 105, 106, 110]

        System.out.println(okulMap.values());
        // [Ali-Cem-10-H-MF, Veli-Cem-10-H-TM, Ali-Can-11-H-Soz, Ayse-Cem-11-H-TM, Ayse-Han-10-H-MF, Veli-Cem-10-H-MF, Kerem-Umut-12-K-MF]

        //System.out.println(okulMap.values().size()); // 7

        // Verilen subedeki ogrencilerin sınıf,isim ve soyisimlerini
        // basta sıra no olcak sekilde her satırda bir ismin
        // olacağı bir liste seklinde yazdırın



        MapMethodDepo.subeOgrenciListesiYazdir (okulMap,"M");


    }
}
