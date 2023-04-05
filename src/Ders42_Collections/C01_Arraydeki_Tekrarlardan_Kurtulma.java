package Ders42_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Arraydeki_Tekrarlardan_Kurtulma {
    public static void main(String[] args) {

        /*
        Verilen bir arraydeki tekrar eden elementleri sadece 1 kere yazdıracak
        array i kısaltan bir kod yaziniz
        Hint: SET kullanınız
        int [] arr = {1,2,1,3,4,5,1,2,6,2,3,4,5,1,3,2,6,5,7};
         */

        int [] arr = {1,2,1,3,4,11,5,9,1,10,2,6,2,3,4,8,5,1,3,2,6,5,7};
        Set <Integer> benzersizSet= new HashSet<>();
        // Set methodu array i tararken aynı elementi gördüğünde
        // eskisini siler yenisini yazar

        // Array deki tüm elementleri olusturdugumuz set e ekleyelim

        for (int each:arr
             ) {
            benzersizSet.add(each);

        }
        System.out.println(benzersizSet); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(Arrays.toString(arr));
        arr=new int[benzersizSet.size()];

        int index=0;
        for (int each :benzersizSet
             ) {
            arr[index]=each;
            index++;

        }
        System.out.println("array'in son hali : " + Arrays.toString(arr));

        //String []arr1 = {"Ali","Veli","Can"};
       // Set <String> benzersizStr= new HashSet<>();

       // for (String each:arr1
        //     ) {
        //    benzersizStr.add(each);

        //}
       // System.out.println(benzersizStr);// [Can, Veli, Ali]








    }
}
