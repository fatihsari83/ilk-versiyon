package Ders33_Poliformizim;

public class BChild extends AParent{
@Override
    void method1(){
        //super.method1();
        // burada super. olursa hem child class daki method1
        // hem de super class daki method1 calisir


    }

    void method2(){

        /*
        bir method override edildiğinde child class da @override
        rotasyonu KULLANILABILIR

        kullanmak veya kullanmamak arasında pratikde soyle bir
        sonuc olusur.

        eger rotasyon kullanılıesa iki method arasındaki ilişki
        takip edilir.
        parent class daki method silinirse rotasyon CTE verir.

        notasyon yoksa parent class daki overriding method silinirse
        bir uyarı verilmez CTE olusmaz.
         */
    }
    int method3(){

    /*
    overridden method ile overriding metho un
    isim ve signature lari ayni olmalidir

    retun type ve access modifier
    signature a dahil değildir.
    ancak overridng de bunlarla ilgili de kurallar vardir.

    1- access modifier kurali:
        child parent i kısıtlayamaz
      eger overriddin ve overriding methodlari
     private yaparsak
     bu iki method BAGIMSIZ OLARAK çalışır.
     aralarındaki override işlemi olmaz

     2- Return type kurali;
        return type primitive veya void ise
        iki method un return type i AYNİ OLMALİDİR.

        non-primitive oldugunda ya ayni olmali
        veya parent class daki return type
        child class daki return type ın parent i OLMALI
        (Covariant data)
     */
    return 5;
    }
}
