package Ders40_Maps;

import Ders39_Maps.MapMethodDepo;

import java.util.Map;

public class C01_Update {
    public static void main(String[] args) {


        // verilen map de sube isimleri M olanlari
        // subesini N yapin


        Map <Integer,String> okulMap= MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);
        // {101=Ali-Cem-10-H-MF,
        // 102=Veli-Cem-10-H-TM,
        // 103=Ali-Can-11-H-Soz,
        // 104=Ayse-Cem-11-H-TM,
        // 105=Ayse-Han-10-H-MF,
        // 106=Veli-Cem-10-H-MF}


        System.out.println(okulMap.get(101)); // Ali-Cem-10-H-MF
        okulMap.put(101,"Ali-Cem-10-M-MF");
        okulMap.put(102,"Kemal-Cem-11-H-TM");
        System.out.println(okulMap);

        // 1- once value leri bir collection olarak kaydedilim.
        // 2- her bir key e ait value i split ile arraye donusturelim.
        // 3- sube bilgisi eskiSube olanları yeniSube yapalim
        // 4- array deki bilgileri birleştirerek yeniden map e ekleyelim.
        // 5- okulMap in son halini return yapalim.



        // 6- return edilen yeni halini eski okulMap e assign edelim
        okulMap=MapMethodDepo.topluSubeDegistirme(okulMap, "H","K");

        System.out.println(okulMap);
    }
}
