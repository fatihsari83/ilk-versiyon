package Ders28_Access_Modifier_Inheritance;

public class C01 {

    String str ; // class level daki her class uyesinin access modifier i olur.
                // eger access modifier gorunmuyorsa Java o class uyesini default
                // access modifier olarak
    static  String s;

    public int sayi;

    public static int a;
    private int b;
    private static int c=10;
    public int d;

    public static void main(String[] args) {

        int sayi = 10;

        /*
        bir method içerisinde public, protected, private gibi access modifer
        lar veya static keyword KULLANILMAZ
         *///
        // System.out.println(b); static
        System.out.println(c);

        // str = "Java"; static
        s= "Hava";
        a=10;
        // d=20; static
    }

    void method(){
        System.out.println(b);
        System.out.println(c);

        str = "Java";
        s= "Hava";

        a=10;
        d=20;

    }
    static void method2(){

    }
    public void method3(){

    }

}
