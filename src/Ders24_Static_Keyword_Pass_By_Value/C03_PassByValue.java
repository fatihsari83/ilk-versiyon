package Ders24_Static_Keyword_Pass_By_Value;

import java.util.Arrays;

public class C03_PassByValue {

    public static void main(String[] args) {

        int[] arr = {3,4,5};

        elementleriArttir(arr,4);
        System.out.println("method call dan sonra arr : " + Arrays.toString(arr));
    }
    public static void elementleriArttir(int [] arr, int artisMiktari){
        for (int i = 0; i < arr.length; i++) {
            arr[i] += artisMiktari;
        }
        System.out.println("method da array : " + Arrays.toString(arr));
    }
}
