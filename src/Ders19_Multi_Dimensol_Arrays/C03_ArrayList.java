package Ders19_Multi_Dimensol_Arrays;

import Ders17_Arrays_Multi_Dimensional_Arrays.C06_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayList {
    public static void main(String[] args) {

        /*
            ArrayList, uzunlugu esnek bir listed,r.
            array in alt yapisini kullanir.
            ekleme ve silme gibi islemlerde daha avantajlıdır

            ArrayList in tek dezavantajı var
            o da elementleri tek tek eklememiz gerekmesi
         */

        int [] arr = {3,4};
        arr = C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr, 5);

        System.out.println(Arrays.toString(arr)); //[3, 4, 5]

        arr = C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr, 15);

        System.out.println(Arrays.toString(arr)); //[3, 4, 5, 15]

        List <String> harfler = new ArrayList<>(); // bos bir list olusturur.
        System.out.println(harfler); // []

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");
        System.out.println(harfler); //[s, l, a]
    }
}
