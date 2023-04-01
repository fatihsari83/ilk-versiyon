package Ders40_Maps;

import Ders39_Maps.MapMethodDepo;

import java.util.Map;

public class C02_Update {
    public static void main(String[] args) {

        // verilen okulMap inde
        // ogrencilerin sınıflarını 1 artırın
        // eger 12.sınıf varsa , sınıf bilgisi olarak mezun yazin

        // eger update varsa, key ve value birlikte dusunulmelidir.
        // aynı key ile yeni value yi map e eklediğimizde
        // key unique olacagı icin eski value yi update edip
        // yeni degerini kaydeder.


        Map <Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);
        okulMap = MapMethodDepo.yilSonuSiniflariDegistir(okulMap);
        System.out.println(okulMap);







    }
}
