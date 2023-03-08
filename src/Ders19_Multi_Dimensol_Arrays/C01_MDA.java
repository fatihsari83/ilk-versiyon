package Ders19_Multi_Dimensol_Arrays;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        //Soru 2- Verilen 2 katli bir array'de
        // ayni index'e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin.
// input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
// output:                       [5, 7, 11]


        int[][] arr =  {{3,4,5}, {2,3,6,7}};

        // ortak index kullanabilmek icin en kısa olanı bulmalıyız

        int enKisaArrayLenght = arr[0].length; //3

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length  < enKisaArrayLenght){
                enKisaArrayLenght = arr[i].length;
            }
        }

        // toplamlari koymak icin yeni bir array olısturalim

        int [] toplamlarArrayi = new int[enKisaArrayLenght];

        int indexdekiElementlerToplami=0;

        for (int i = 0; i < toplamlarArrayi.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                indexdekiElementlerToplami += arr[j][i];

            }
            toplamlarArrayi[i]= indexdekiElementlerToplami;
            indexdekiElementlerToplami=0;

        }
        System.out.println(Arrays.toString(toplamlarArrayi));





    }
}
