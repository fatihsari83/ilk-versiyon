package Ders17_Arrays_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class C08_sort_binarySearch {
    public static void main(String[] args) {

        // verilen bir array i antural order a gore sıralamak
        // icin Array.sort() kullanilir

        int[]arr1= {3,9,6,1,7};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"Hasan", "Huseyin","Mehmet","Mesut","Mercan","ali"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); //[Hasan, Huseyin, Mehmet, Mercan, Mesut, ali]

        // sort yapildiktan sonra
        // array de bir elementin  var oldugunu kontrol etmek icin


    }
}
