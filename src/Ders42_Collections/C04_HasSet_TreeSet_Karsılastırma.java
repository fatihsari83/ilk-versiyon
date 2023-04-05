package Ders42_Collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class C04_HasSet_TreeSet_Karsılastırma {
    public static void main(String[] args) {

        /*
        bir hasset ve bir treeset olusturalim.
        bir loop ile iclerine 150000 eleman ekleyelim
        islem surelerini kıyaslayalım
         */

        Random rnd= new Random();
        int sayi;
        Set<Integer> hashSet= new HashSet<>();
        Set<Integer> treeSet= new HashSet<>();
        Long hashStart =System.currentTimeMillis();

        for (int i = 0; i < 150000; i++) {

            sayi=rnd.nextInt(1250000);
            hashSet.add(sayi);
        }
        Long hashFinish =System.currentTimeMillis();

        Long treeStart =System.currentTimeMillis();

        for (int i = 0; i < 150000; i++) {

            sayi=rnd.nextInt(1250000);
            treeSet.add(sayi);
        }
        Long treeFinish =System.currentTimeMillis();

        System.out.println("Hash islem suresi : " + (hashFinish-hashStart));
        System.out.println("Tree islem suresi : " + (treeFinish-treeStart));

    }
}
