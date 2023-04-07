package Ders44_Maps_Entry_Set;

import java.util.Map;
import java.util.TreeMap;

public class C03_Compare {
    public static void main(String[] args) {

        /*
        / verilen bir String array’de her bir sayinin kacar
        defa kullanildigini yazdirin
        // Ornek : String[] arr = {“A”,“C”,“B”,“N”,“A”,“N”,“A”}
               // Output : A=3, B=1, C=1, N=2
         */

        String [] arr = {"A","C","B","N","A","N","A"};


        Map <String,Integer> kullanimMiktari= new TreeMap<>();

        // contains () kullanarak yapalım

        // arr deki her bir elementi ele alalım

        for (String each : arr
             ) {
            // eger ele aldıgım element map de yoksa
            // map e element 1 eklerim

            if (!kullanimMiktari.containsKey(each)){
                kullanimMiktari.put(each,1);
            }else{
                // eger o element daha once map te varsa
                // o zaman value yı 1 arttırmamız lazım

                int elementinEskşKullanımMiktari= kullanimMiktari.get(each);
                kullanimMiktari.put(each, elementinEskşKullanımMiktari+1);
            }

        }
        System.out.println(kullanimMiktari);


        // compute methodları kullanarak da yapabiliriz

        Map <String,Integer> kullanım2 = new TreeMap<>();

        for (String eachHarf: arr
             ) {




            // eger o element daha once map te varsa
            // o zaman value yı 1 arttırmamız lazım

            kullanım2.computeIfPresent(eachHarf, (k,v) -> v+1);

            // eger ele aldıgım element map de yoksa
            // map e element 1 eklerim
            kullanım2.putIfAbsent(eachHarf,1);


        }
        System.out.println(kullanım2);
    }
}
