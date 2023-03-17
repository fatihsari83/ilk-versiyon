package Ders31_inheritance;

public class DCorolla extends CToyota{
    String str3 ="Corolla";

    DCorolla(){
        System.out.println("Parametresiz Corolla constractor'i calisti");
    }

    DCorolla(int sayi){
        super(8);
        System.out.println("Int Parametreli Corolla constractor'i calisti");
    }

    public static void main(String[] args) {

        DCorolla obj1= new DCorolla(5);

    }

    /*
    Biz görünür bir cons olusturdugumuzda Java nın
    default cons u silmesine benzer olarak

    Extends keyword kullanilmiş bir class daki
    herhangi bir cons un ilk satırında
    gozle gorunur bir cons call yazilmissa
    java default olarak koydugu super() cons call i siler
     */





}
