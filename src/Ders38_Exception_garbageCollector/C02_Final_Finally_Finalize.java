package Ders38_Exception_garbageCollector;

public class C02_Final_Finally_Finalize {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE); // -2147483648

        System.out.println(Math.PI);// 3.141592653589793
        System.out.println("=============");

        try {
            System.out.println(10 / 0);
            System.out.println("bolmenin sonrasindaki satir");


        } catch (Exception e) {

            System.out.println("catch blogundaki satir");

            throw new RuntimeException(e);

        } finally {
            System.out.println("finally blogundaki satir");
        }
    }
}
