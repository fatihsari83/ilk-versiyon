package Ders39_Maps;

import java.util.*;

public class MapMethodDepo {

    public static Map <Integer,String> ornekMapOlustur(){

        Map  <Integer,String> okulMap= new HashMap<>();
        okulMap.put(101, "Ali-Cem-10-H-MF");
        okulMap.put(102,"Veli-Cem-10-H-TM");
        okulMap.put(103,"Ali-Can-11-M-Soz");
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

    public static Map<Integer, String> topluSubeDegistirme(Map<Integer, String> okulMap, String eskiSube, String yeniSube) {

        // 1- once value leri bir collection olarak kaydedilim.
        Set<Integer> okulKeySeti=okulMap.keySet();

        for (Integer eachKey:okulKeySeti
             ) {
            // 2- her bir key e ait value i split ile arraye donusturelim.
            String[] valueArr= okulMap.get(eachKey).split("-");

            // 3- sube bilgisi eskiSube olanları yeniSube yapalim

            if (valueArr[3].equalsIgnoreCase(eskiSube)){
                valueArr[3]= yeniSube; //
            }


            // 4- array deki bilgileri birleştirerek yeniden map e ekleyelim.
            String yeniValue="";
            for (int i = 0; i < valueArr.length-1; i++) {

                yeniValue+= valueArr[i] + "-";

            }

            yeniValue+= valueArr[valueArr.length-1];

            okulMap.put(eachKey,yeniValue);
        }



        // 5- okulMap in son halini return yapalim.

        return okulMap;

    }

    public static Map<Integer, String> yilSonuSiniflariDegistir(Map<Integer, String> okulMap) {

        // 1- key leri bir Set olarak kaydedelim

        Set <Integer> keySeti=okulMap.keySet(); //[101, 102 ,103 ,104 ,105, 106]

        // 2- Set teki herbir key e ait value i for-each loop ele alalım

        for (Integer eachKey:keySeti
             ) {

            // 3- her key e ait value yu split ile ayırıp array olarak kaydedelim.

            String[] valueArr = okulMap.get(eachKey).split("-"); // [Ali, Cem ,10, H, MF]

            // 4- array olarak kaydettiğimiz bilgilerde istenen update yi yapalım

            if (valueArr[2].equalsIgnoreCase("12")){
                valueArr[12]= "Mezun";
            }else { // "9" "10" "11"
                int sinif= Integer.parseInt(valueArr[2]);
                sinif++;

                valueArr[2]= sinif+"";

            } // [Ali, Cem ,11, H, MF]

            // 5- array in yeni halini String olarak birlestirip yeniValue elde edelim.

            String yeniValue="";
            for (int i = 0; i < valueArr.length-1; i++) {
                yeniValue+= valueArr[i]+ "-";
            }
            yeniValue+= valueArr[valueArr.length-1];

            // 6- her bir key ve yeniValue yi map e ekleyerek map i update edelim

            okulMap.put(eachKey,yeniValue);
        }

        // 7- map in yeni halini return edelim.
    return okulMap;



    }
}
