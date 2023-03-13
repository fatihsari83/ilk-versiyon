package Ders25_Mutable_Immutable_Classes;

public class C03_ImmutableClasses {
    public static void main(String[] args) {
        /*
        Java da bir classdan ve o classdan olusturulan objeler
        ya mutable dir ya da immutable dir.

        Java metinsel ifadeleri atayabilecegimiz 3 class olusturmustur.
        String  -- immutabledir
        StringBuilder --- mutabledir
        StringBuffer ---- mutable

        immutable bir class dan olusturulan objelerde immutable dir.
        String immutble oldugundan ayni str objesine yeni deger atandıginda Java
        eski degeri degistirmez.
        Bunun yerine istenen yeni degere sahip yeni bir obje olusturur.
        ve str in pointer ini yeni objeye yoneltir.

        kullanilmayan eski objeler
        Garbage Collector tarafindan toplanmak uzere beklerler.

         */

        String str = "Java candir";

        str = str.toLowerCase();
        System.out.println(str); // java candir

        str= str.toUpperCase();
        System.out.println(str);// JAVA CANDİR

        String s = "Hava";
        for (int i = 0; i < 100; i++) {
            s= s+ ".";
        }
    }
}
