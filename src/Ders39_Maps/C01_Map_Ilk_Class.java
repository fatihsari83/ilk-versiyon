package Ders39_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_Map_Ilk_Class {
    public static void main(String[] args) {

        Map  <Integer,String> okulMap= new HashMap<>();

        /*
        Bir map olustururlurken ve element eklerken
        bilgilere sonradan erisimin mumkun olabilmesi icin
        tum elementleri aynı bilgileri barındırdıgında ve
        aynı sıralama ile lemente eklendiğinden emin olmalıyız
         */

        okulMap.put(101,"Ali,Cem,10,H,MF");
        okulMap.put(102,"Veli,Cem,10,H,TM");
        okulMap.put(103,"Ali,Can,11,H,Soz");
        okulMap.put(104,"Ayse,Cem,11,H,TM");
        okulMap.put(105,"Ayse,Han,10,H,MF");
        okulMap.put(106,"Veli,Cem,10,H,MF");

        System.out.println(okulMap);

        // bir map te kac eleman var

        System.out.println(okulMap.size()); // 6

        // tum key leri yazdıralım.

        System.out.println(okulMap.keySet()); // [101, 102, 103, 104, 105, 106]

        // tum value ları yazdıralım

        System.out.println(okulMap.values());
        //[Ali,Cem,10,H,MF, Veli,Cem,10,H,TM, Ali,Can,11,H,Soz, Ayse,Cem,11,H,TM, Ayse,Han,10,H,MF, Veli,Cem,10,H,MF]


        // value collectıon ıcerisinde kac element vardır
        System.out.println(okulMap.values().size()); // 6
        // value lar tek bir elementtir
    }
}
