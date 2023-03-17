package Ders32_Inheritance_Datatype_Kullanimi_Overriding;

public class CAvciKuslar extends BKuslar {

    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";




    public static void main(String[] args) {

        CAvciKuslar kartalAvci = new CAvciKuslar();
        System.out.println(kartalAvci.hareket); // A ucarlar
        System.out.println(kartalAvci.beslenme); // C et yerler
        System.out.println(kartalAvci.pence); // C pençelidir
        System.out.println(kartalAvci.gaga); // C sivri gagalidir

        System.out.println(kartalAvci.kanat); // B kuslar
        System.out.println(kartalAvci.solunum); // B akcigerler
        System.out.println(kartalAvci.cogalma); // B yumurtayla

        System.out.println(kartalAvci.omur); // A yasar ve olur

        System.out.println("==================");

        BKuslar kartalKus = new CAvciKuslar();
        System.out.println(kartalKus.hareket); // A hareket ederler
        System.out.println(kartalKus.beslenme); // A beslenirler
        //System.out.println(kartalKus.pence); // CTE
        System.out.println(kartalKus.gaga); // B gagalari vardir

        System.out.println(kartalKus.kanat); // B kanatlidirlar
        System.out.println(kartalKus.solunum); // B akcigerle nefes alirlar
        System.out.println(kartalKus.cogalma); // B yumurtayla cogalirlar

        System.out.println(kartalKus.omur); // A yasar ve olurler

        System.out.println("==================");

        AHayvanlar kartalHayvan = new CAvciKuslar();
        System.out.println(kartalHayvan.hareket); // A hareket ederler
        System.out.println(kartalHayvan.beslenme); // A beslenirler
        //System.out.println(kartalHayvan.pence); // CTE
        //System.out.println(kartalHayvan.gaga); // CTE

        //System.out.println(kartalHayvan.kanat); // CTE
        System.out.println(kartalHayvan.solunum); // A nefes alirlar
        System.out.println(kartalHayvan.cogalma); // A cogalirlar

        System.out.println(kartalHayvan.omur); // A yasar ve olurler

        /*
            Eger bir obje olusturulurken
            Data turu ve constractor ayni ise
            aradagımız ozellikler icin direkt o class a gider ve
            ozellikleri arariz

            Eger data turu ve constractor farkli ise variable ve
            metodlar farkli davranirlar

            Variable lar
            - once data turunun oldugu class a bakar
            - o variable yi bulursa degerini yazdirir
            - bulamazsa data turunun parentlarına bakar
            orada bulursa degerini yazdirir
            - orada da bulamazsa CTE verir.
         */

    }

}
