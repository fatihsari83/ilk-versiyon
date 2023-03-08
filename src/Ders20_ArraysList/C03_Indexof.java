package Ders20_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class C03_Indexof {
    public static void main(String[] args) {

        List <String> isimler = new ArrayList<>();

        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");
        isimler.add("Mustafa");

        System.out.println(isimler);

        // 2. indexteki elementi yazdirin

        System.out.println(isimler.get(2)); // Emre

        // Ferhat in ındexii yazdır

        System.out.println(isimler.indexOf("Ferhat")); // 3
        System.out.println(isimler.lastIndexOf("Ferhat")); // 3

        System.out.println(isimler.lastIndexOf("Fatih")); // -1

        //
        System.out.println(isimler);
        System.out.println(isimler.indexOf("Mustafa")); // 1
        System.out.println(isimler.lastIndexOf("Mustafa")); // 5


    }
}
