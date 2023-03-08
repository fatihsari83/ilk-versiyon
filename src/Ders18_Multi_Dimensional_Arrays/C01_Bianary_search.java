package Ders18_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class C01_Bianary_search {
    public static void main(String[] args) {

        // verilen bir array de istenen elemanin
        // olup olmadıgını bulur

        int[]arr= {4,9,1,5,11,3,7,4,6};

        System.out.println(Arrays.binarySearch(arr, 5));// 4
        System.out.println(Arrays.binarySearch(arr, 11)); // 8
        System.out.println(Arrays.binarySearch(arr, 1));  // 0
        System.out.println(Arrays.binarySearch(arr, 7)); // 6

        // Array de binary search() metodunun duzgun calismasi
        // icin oncelikle sort() calistirilmalidir.

        Arrays.sort(arr); //

        System.out.println(Arrays.binarySearch(arr, 5));// 4
        System.out.println(Arrays.binarySearch(arr, 11)); // 8
        System.out.println(Arrays.binarySearch(arr, 1));  // 0
        System.out.println(Arrays.binarySearch(arr, 7)); // 6
        System.out.println(Arrays.binarySearch(arr, 4)); // 2

        // binarySearch() aranan elementin index ini doner

        System.out.println(Arrays.binarySearch(arr, 2)); // -2
        System.out.println(Arrays.binarySearch(arr, 8)); // -8
        System.out.println(Arrays.binarySearch(arr, 10)); // -9
        System.out.println(Arrays.binarySearch(arr, 13)); // -10
        System.out.println(Arrays.binarySearch(arr, 20)); // -10


        // Olmayan bir element aratilirsa once array de
        // olsaydi nerede olurdu bunu buluyoruz.
        // Olmasi gereken siranin (-) isaretli degerini veriyoruz.
        // bu mantikla en kucuk element den daha kucuk
        // butun sayilar ıcın -1 en buyuk elementden buyuk
        // olan butun sayilar icin de -lenght-1 degeri dondurur.

    }

}
