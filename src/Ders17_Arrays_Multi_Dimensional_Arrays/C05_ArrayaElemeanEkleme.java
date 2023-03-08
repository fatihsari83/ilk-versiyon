package Ders17_Arrays_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class C05_ArrayaElemeanEkleme {
    public static void main(String[] args) {

        // Verilen array e istenen elementi ekleyelim
        /*
        int [] a= {4,5,6};
        int [] b= {4,5,6,10};

        a=b;

        System.out.println(Arrays.toString(a));

            Array in uzunlugu degistirilmez.
            Ancak Array e yeni bir array degeri atanabilir.
         */


        int []arr = {4,5,6};
        int eklenecekElement = 10;


        // arr = new int[4]; // [0,0,0,0] direkt atama
        // yaparsak eski degerler kaybolur.
        // onceden istenen uzunlukta yeni bir array olusturup
        // eski array deki tum elementleri yeni array e tasıyoruz
        // sonra istenen elementi atayip
        // yeni istedigimiz hale gelince
        // eskiArr = yeniArr; diyerek yeni array in
        // degerini eskisine atiyoruz

        int [] yeniArr = new int [arr.length+1]; // [0,0,0,0]
        for (int i = 0; i < arr.length; i++) {

            yeniArr[i]=arr[i]; // [4,5,6,0]

        }

        yeniArr[yeniArr.length-1] = eklenecekElement;

        System.out.println(Arrays.toString(yeniArr));




    }
}
