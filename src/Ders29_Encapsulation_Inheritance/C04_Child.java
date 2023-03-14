package Ders29_Encapsulation_Inheritance;

public class C04_Child extends C03_Parent_Class{

    int c=20;
    int a;

    String s = "Child class";
    String m;
    public void method1(){
        System.out.println("child class method1");
    }

    public static void main(String[] args) {
        C03_Parent_Class objC03= new C03_Parent_Class();
        objC03.a=20;
        objC03.b=22;
        objC03.s= "p";
        objC03.t= "k";
        objC03.method1();
        objC03.method2();



        C04_Child objC04= new C04_Child();
        objC04.a=50;
        objC04.c=20;
        objC04.s="u";
        objC04.m="l";
        objC04.method1();


        // C04 clasını C03 e child yapinca
        // child class da olmayip, parent class ta olan
        // b, t ve method2 ozellik olarak objC04 eklendi.
        objC04.b=8;
        objC04.t="y";
        objC04.method2();


        /*
            Java da parent classlar child edilmez.
            Child classlar parent edinir.

            Bir classın baska bir classdaki TUM OZELLIKLERI
            otomatik olarak edinmesini istiyorsak
            classımızı extends keyword ile o classa child yapariz
            (Size baba diyebilir miyim // size parent diyebilir miyim)
         */




    }

}
