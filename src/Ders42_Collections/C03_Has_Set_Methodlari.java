package Ders42_Collections;

import java.util.HashSet;
import java.util.Set;

public class C03_Has_Set_Methodlari {
    public static void main(String[] args) {

        Set <String> set1= new HashSet<>();
        set1.add("Kadir");
        set1.add("Yusuf");
        set1.add("Suleyman");
        set1.add("Emre");
        set1.add("Can");
        set1.add(null);

        System.out.println(set1); // [null, Suleyman, Can, Yusuf, Kadir, Emre]

        set1.add("Emre");
        System.out.println(set1); // [null, Suleyman, Can, Yusuf, Kadir, Emre]
    }
}
