package Ders27_String_Builder_Access_Modifier;

public class C04_StringBuilderStringMetodlari {
    public static void main(String[] args) {
        /*
        StringBuilder class ında olmayıp,
        String Class inda olan methodlari kullanmak istersek
        sb.toString() kullanarak, StringBuilder i String e cevirir.
        sonra istedigimiz String methodlarini kullaniriz.

        Bu konuda DİKKAT etmemiz gereken konu
        String donduren methodlar veya String
         */

        StringBuilder sb1 = new StringBuilder("Java Candir");
        StringBuilder sb2 = new StringBuilder("Java candir");

        sb1.substring(5);
        System.out.println(sb1); // Java Candir

        //sb1= sb1.substring(5);

        System.out.println(sb1.compareTo(sb2)); // -32

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true

        sb1.substring(3,6);
        System.out.println(sb1); // Java Candir


    }
}
