package Ders27_String_Builder_Access_Modifier;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();

        System.out.println(sb1.capacity()); // 16

        System.out.println(sb1.length()); // 0

        sb1.append("Mustafa");
        System.out.println(sb1.capacity()); // 16

        System.out.println(sb1.length()); // 7
        sb1.append(" Yılmaztürk");
        System.out.println(sb1.capacity()); // 34= 2* eski capacity

        System.out.println(sb1.length()); // 18

        sb1.append(" javayi cok sever, sabah aksam Java calisir");
        System.out.println(sb1.capacity()); // 70= 2 * 34 +2

        System.out.println(sb1.length()); // 61

        // 2.yöntem

        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb2.capacity()); // 27

        System.out.println(sb2.length()); // 11


        // 3.yöntem

        StringBuilder sb3 = new StringBuilder(11);
        sb3.append("56897456123");
        System.out.println(sb3.capacity()); // 11

        System.out.println(sb3.length()); // 11


        String str = "Java Candir";

        sb3.append(str, 4,str.length()-1);
        System.out.println(sb3);

        // trim:

        sb3.trimToSize();
        System.out.println(sb3.capacity()); // 17

        System.out.println(sb3.length()); // 17
    }

}
