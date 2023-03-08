package Ders21_Array_List_Foreach_Loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiArrayListeCevirme {
    public static void main(String[] args) {

        Integer []arr= {3,5,7,3,2,3,5,8,7,1,2,3,4,5,8};

        // arr array inin elementlerini iceren bir arrayList olusturun
        List <Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }

        System.out.println("Sayilar listesi : " + sayilar);

        /*
            Java da bir arrayi arrayListe cevirmek icin kullanilan
            asList() vardir

            1- asList() kullanilarak array den liste cevrilen
                listelerde ekleme/silme gibi uzunlugu degistiren
                methodlar kullanlmaz

            2-  Arka planda array ve arrayden donusturdugumuz list
                beraber hareket eder. Birinde yaptıgımız
                update lar otekine islenir
         */

        List  <Integer> arraydenList= Arrays.asList(arr);

        System.out.println("Array den liste cevrilen : " + arraydenList);

        // iki listede 11 ekleyelim

        sayilar.add(11);
        //arraydenList.add(11);

        System.out.println("Sayilar listesi : " + sayilar);
        System.out.println("Array den liste cevrilen : " + arraydenList);

        // iki listin 0.indexindeki elementleri silelim.

        sayilar.remove(0);
       // arraydenList.remove(0); //.UnsupportedOperationException
        System.out.println("Sayilar listesi : " + sayilar);
        System.out.println("Array den liste cevrilen : " + arraydenList);

        // 2. dezeavantaj

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Arra den list : "+ arraydenList);

        // array in bir elementine yeni bir deger atayalim

        arr [0]=22;
        System.out.println("======= arrayi degistirdikten sonra=====");

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Arra den list : "+ arraydenList);

        // listin bir elementini update yapalim
        arraydenList.set(1,45);

        System.out.println("======= listii degistirdikten sonra=====");

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Arra den list : "+ arraydenList);
    }
}
