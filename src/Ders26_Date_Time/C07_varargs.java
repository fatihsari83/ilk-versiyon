package Ders26_Date_Time;

public class C07_varargs {
    public static void main(String[] args) {


        // verilen iki sayiyi toplayip yazdiran bir metod olusturun
        topla(3,6); // 9
        topla(3,4,5); // 12
        topla(1,2,3,4); // 10
    }

    public static void  topla(int a , int b){

        System.out.println(a+b);
    }
    public static void  topla(int a , int b , int c){

        System.out.println(a+b+c);
    }
    public static void  topla(int a , int b , int c, int d){

        System.out.println(a+b+c+d);
    }
}
