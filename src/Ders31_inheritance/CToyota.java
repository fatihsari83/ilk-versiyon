package Ders31_inheritance;

public class CToyota extends BAraba{

    protected String str2="Toyota";

    protected CToyota(){
        System.out.println("Parametresiz Toyota constractor'i calisti");
    }
    protected CToyota(int sayi){
        System.out.println("Int Parametreli Toyota constractor'i calisti");
    }

    protected CToyota(String s){
        System.out.println("String Parametreli Toyota constractor'i calisti");
    }
}
