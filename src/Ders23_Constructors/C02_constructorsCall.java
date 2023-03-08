package Ders23_Constructors;

public class C02_constructorsCall {
    /*
        Java da ihtiyac olursa bir constructor icinden baska
        constructor cagırabilir. this(ilgili parametreler)
        yazarak istedigimiz constructor i cagirabiliriz.

        Constructor call icin 2 kural vardir.
        1- Constructorcall icinde bulundugu Constructor'in
        ilk satirinda olmalidir
     */
    int sayi;
    String str;
    public C02_constructorsCall() {
        System.out.println("parametresiz cons calisti");

    }

    public C02_constructorsCall(int sayi) {
        System.out.println("int parametreli cons calisti");
        this.sayi = sayi;
    }

    public C02_constructorsCall(String str) {
        this(5);
        System.out.println("String parametreli cons calisti");
        this.str = str;
    }

    public C02_constructorsCall(int sayi, String str) {
        //C02_constructorsCall(); boyle yazildiginda method call olarak algilar
        this(); // Java syntax constructor call icin bunu belirlemistir.
        this.sayi = sayi;
        this.str = "Java";
        System.out.println("2 parametreli cons calisti");
    }

    public static void main(String[] args) {
       C02_constructorsCall obj3 = new C02_constructorsCall(7,"Selcuk");
        System.out.println(obj3.sayi); // 7
        System.out.println(obj3.str); // Java



       /* C02_constructorsCall obj2 = new C02_constructorsCall("Java");
        System.out.println(obj2.sayi);
        System.out.println(obj2.str);

        */
    }
}
