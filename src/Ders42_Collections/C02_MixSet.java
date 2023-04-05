package Ders42_Collections;

import java.util.*;

public class C02_MixSet {
    public static void main(String[] args) {

        Set <Object> mixSet = new HashSet<>();

        mixSet.add(12);
        mixSet.add("Java");
        mixSet.add('S');
        mixSet.add(true);

        int []arr = new int[3];
        mixSet.add(arr);

        List <Object> mixList= new ArrayList<>();
        mixList.add("Hava");
        mixList.add(24);

        mixSet.add(mixList);

        System.out.println(mixList); // [Hava, 24]
        System.out.println(mixSet); // [Java, [Hava, 24], [I@378bf509, S, 12, true]

        // Collections objeleri birarada tutan yapılardır.

        System.out.println(mixSet.size()); // 6
        System.out.println(mixSet.contains(24)); // false
        System.out.println(mixSet.contains(12)); // true
        System.out.println(Arrays.toString(arr)); // [0, 0, 0]

        // Data turu olarak Object secilirse icine her data turunden element konulabilir
        // Ancak elementlere ulasmamız ya da update etmek gibi ,islemleri
        // yapmamız mumkun olmayabilir yada cok zor olabilir
    }
}
