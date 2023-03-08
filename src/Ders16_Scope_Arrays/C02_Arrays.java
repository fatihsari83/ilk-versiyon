package Ders16_Scope_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String[] isimler ={"Ali","Veli", "Mustafa"};
        int [] sayilar = {3,4,5,6,7,8,9};
        char karakterler[] = {'e', '4', ','};

        // Array non-primitive data turlerindendir.
        // Eger array i liste seklinde olusturmayip
        // 'new' keyword kullanirsak
        // UZUNLUGUNU yazmak ZORUNDAYIZ.

        String [] arr = new String[5];

        // Bir array tanimlanan uzunluktan daha fazla veya
        // az eleman alamaz.

        // Array ler direkt yazdirilamaz

        System.out.println(isimler); // [Ljava.lang.String;@378bf509

        System.out.println(Arrays.toString(sayilar)); // [3, 4, 5, 6, 7, 8, 9]

        System.out.println(Arrays.toString(arr)); // [null, null, null, null, null]

        int [] a = new int[7];
        System.out.println(Arrays.toString(a)); // [0, 0, 0, 0, 0, 0, 0]

        //  array deki elementlere nasil ulasiriz? index ile

        a[0]= 4;
        a[3]= 7;
        //a[7]= 8; //.ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(a)); // [4, 0, 0, 0, 0, 0, 0]

        // sayilar array inin 4.indexteki elementi yazdirin
        System.out.println(sayilar[4]); // 7

        // isimler array inin 1.indexindeki ismi yazdirin
        System.out.println(isimler[1]);// Veli




    }
}
