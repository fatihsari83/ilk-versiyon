package Ders24_Static_Keyword_Pass_By_Value;

public class C01_staticBlocks {

    C01_staticBlocks(){
        System.out.println("Cons calisti");
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti");
        System.out.println("========");
        C01_staticBlocks obj1 = new C01_staticBlocks();
    }
    static {
        /*
            static blocklar class ilk calismaya basladiginda calisir.
            genel olarak class icin gerekli on ayarlamalari yapmak icin kullanilir


            birden fazla static block varsa
            yukaridan asagiya dogru sirali calisir
         */
        System.out.println("Static block calisti");
    }
    static {
        System.out.println("Alttaki static calisti");
    }

    {
        /*
            static olmayan block lar ise obje olusturulurken
            cons dan once calisir.
            obje icin yapilmasi gereken on ayarlamalari yapmak icin kullanilir
         */
        System.out.println("Static olmayan block calisti");
    }

}
