package Ders39_Maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {

    public static Map <Integer,String> ornekMapOlustur(){

        Map  <Integer,String> okulMap= new HashMap<>();
        okulMap.put(101, "Ali-Cem-10-H-MF");
        okulMap.put(102,"Veli-Cem-10-H-TM");
        okulMap.put(103,"Ali-Can-11-H-Soz");
        okulMap.put(104,"Ayse-Cem-11-H-TM");
        okulMap.put(105,"Ayse-Han-10-H-MF");
        okulMap.put(106,"Veli-Cem-10-H-MF");

        return okulMap;
    }
    public static void subeOgrenciListesiYazdir (Map <Integer,String>okulmap, String istenenSube) {
        // 1- Value lari ayri bir collection olarak kaydedelim
        Collection<String> valueCollection = okulmap.values();

        // 2- Her bir value i split ile bir array e donusturelim
        System.out.println("========Sube Listesi =======");
        System.out.println("Sıra    Sınıf   Isım   Soyisim");
        int siraNo1=1;

        for (String eachValue: valueCollection
             ) {
            // Ali-Cem-10-H-MF

            String [] valueArr = eachValue.split("-");

            // 3- array den sube yi kontrol edip
            // eger istenen sube ise ogrencinin sınıf isim ve soyisimini yazdirin

            if (valueArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(siraNo1+ " - " +valueArr[2] + " , " + valueArr[0] + ", " + valueArr[1]);
                siraNo1++;
            }

        }


    }
}
