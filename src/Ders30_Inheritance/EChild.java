package Ders30_Inheritance;

public class EChild extends DParentAccessModifier{


    static int sayiChildStatic;
    public static void main(String[] args) {



        EChild eChild = new EChild();
        System.out.println(eChild.sayiDefault);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiPublic);

// icinde bukundugumuz class daki static variableler
        // obje uzerinden otomatik gelmez
        // ama manuel yazdıgimizda Java kabullenir

        System.out.println(eChild.sayiChildStatic);

        // ancak parent class daki static variable lar
        // obje uzerinden KULLANILMAZ
        //System.out.println(eChild.sayiStaticPrivate);

        System.out.println(DParentAccessModifier.sayiStaticPublic);
        // bu kullanim icin inheritance a ihtiyac yok.
        // her hangi bir class daki static variable i
        // classIsmi.staticVariableIsmi seklinde kullanabiliriz




    }
}
