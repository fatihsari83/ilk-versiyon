package Ders28_Access_Modifier_Inheritance;

public class C02 {
    public static void main(String[] args) {
        C01 obj = new C01();

        // System.out.println(C01.b); access modifieri private
        // System.out.println(C01.c); access modifieri private


        obj.str = "tava";
        C01.s= "Tava";

        C01.a= 50;
        obj.d=40;

    }
}
