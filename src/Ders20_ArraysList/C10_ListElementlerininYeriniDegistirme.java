package Ders20_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class C10_ListElementlerininYeriniDegistirme {
    public static void main(String[] args) {


        List <Integer> sayilar= new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);
         // 2. index teki element ile 5.index teki elementin
        // yerini degistirin

        System.out.println(sayilar);// [3, 5, 1, 4, 3, 7, 10]

        // once 1 tanesini temp variableye atayalim

        int temp= sayilar.get(2);

        // 2. indexe 5.indexteki degeri atayalim

        sayilar.set(2,sayilar.get(5));

        // 5.indexe temp deki degeri ata
        sayilar.set(5,temp);

        System.out.println(sayilar); //[3, 5, 7, 4, 3, 1, 10]


        // odev : verilen bir listede 2.indexteki elementlerin
        // yerini degistirip yeni listeyi bize donduren
        // bir metod olusturun
    }
}
