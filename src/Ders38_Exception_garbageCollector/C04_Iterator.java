package Ders38_Exception_garbageCollector;

import java.util.ArrayList;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {


        /*
            Java da Colections konusunda ogrenecegimiz Set gibi bazi
            yapilar index desteklemez.

            Bu durumda index olmadıgından elementleri yazdirmak istersek
            for-each loop kullanabiliriz
            Ama elementler arasında dolasmak, belirli sartlari saglayanlari
            update etmek isterseniz, for-each loop ile yapamazsınız.

            Hatta list te istenmeyen elementler silmek istediğimizde
            her sildiğimiz element uzunlugu degistirdiği icin
            kodlar saglıklı calismaz

            Bu sorunlari cozmek icin java Iterator interface ini olusturur.

         */

        List <Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(7);

        // cift olan sayilari silin

        for (int i = 0; i < sayilar.size(); i++) {

            if (sayilar.get(i)%2==0){
                sayilar.remove(i);
            }


        }System.out.println(sayilar);
    }
}
