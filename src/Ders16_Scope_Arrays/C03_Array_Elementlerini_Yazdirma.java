package Ders16_Scope_Arrays;

import java.util.Arrays;

public class C03_Array_Elementlerini_Yazdirma {
    public static void main(String[] args) {

        int[] arr = {3,5,6,7,8,1,2};

        // tum array i yazdirin

        System.out.println(Arrays.toString(arr)); // [3, 5, 6, 7, 8, 1, 2]

        // arrayin tum elementlerini aralarinda bir bosluk
        // birakarak yazdirin

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 3 5 6 7 8 1 2
        }
    }
}
