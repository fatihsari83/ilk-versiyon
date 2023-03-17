package Ders32_Inheritance_Datatype_Kullanimi_Overriding;

public class EChild extends DParent{

    String str = "Child";

    void method1(){
        System.out.println("Child method 1");
    }

    public static void main(String[] args) {

        EChild childC = new EChild();
        childC.method1(); // Child method 1
        System.out.println(childC.str); // Child


        DParent childP = new EChild();
        System.out.println(childP.str); // Parent
        childP.method1(); // Child method 1

    }
}


/*
Override : geçersiz kılma
overridden : gecersiz kılınan
 */