package Ders44_Maps_Entry_Set;

import Ders39_Maps.MapMethodDepo;

import java.util.Map;

public class C02_Entry_Set {
    public static void main(String[] args) {
        /*
        Verilen okul mapteki soyisimleri buyuk harfe cevir
         */

        Map<Integer, String> okulMap= MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        okulMap = MapMethodDepo.soyisimleriBuyukYap(okulMap);
        System.out.println(okulMap);
    }
}
