package Ders19_Multi_Dimensol_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_TekrarlardanKurtulma {
    public static void main(String[] args) {


        // verilen bir array den tekrar eden sayilari
        // silip herbir elementin sadece bir kez kullanildigi
        // bir hale donusturun.

        int [] arr = {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        // bir tane bos list olusturalim
        // array deki herbir elemenı ele alalim
        // ele aldıgımız element list te yoksa ekleyelim
        // varsa eklemeyelim
        // boylece benzersiz elementlerden olusan bir list olusturalim

        List <Integer> benzersizElementList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!benzersizElementList.contains(arr[i])){
                benzersizElementList.add(arr[i]);
            }

        }
        System.out.println(benzersizElementList); // [3, 4, 5, 6, 2, 7]
        // istenen listeyi list olarak elde ettik
        // bunu arr ye dirakt atayamayiz

        arr = new int[benzersizElementList.size()];

        for (int i = 0; i < arr.length; i++) {

            arr[i]= benzersizElementList.get(i);

        }

        System.out.println(Arrays.toString(arr)); //[3, 4, 5, 6, 2, 7]

    }
}
