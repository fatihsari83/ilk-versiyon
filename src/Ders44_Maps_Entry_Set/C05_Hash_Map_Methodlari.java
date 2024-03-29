package Ders44_Maps_Entry_Set;

import java.util.Map;
import java.util.TreeMap;

public class C05_Hash_Map_Methodlari {
    public static void main(String[] args) {

        Map<String,Integer> ornekMap= new TreeMap<>();

        ornekMap.put("A",20);
        ornekMap.put("B",15);
        ornekMap.put("K",25);
        ornekMap.put("M",20);
        ornekMap.put("T",30);

        System.out.println(ornekMap);

        System.out.println(ornekMap.get("K")); // 25
        System.out.println(ornekMap.get("Z")); // null
        // verilen Key varsa value sunu dondurur.
        //yoksa null dondurur

        System.out.println(ornekMap.getOrDefault("Z", 60)); // 60
        // verilen key varsa value sini getirir, yoksa verilen default degeri dondurur

        System.out.println(ornekMap.replace("M", 50)); // 20
        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=30}

        System.out.println(ornekMap.replace("B", 30, 90)); // false
        // verilen Key in eski value si verilen deger ise update edip true doner
        // key in degeri verilen deger degilse bir islem yapmaz ve false dondurur

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=30}
    }
}
