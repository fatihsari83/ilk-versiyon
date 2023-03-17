package Ders32_Inheritance_Datatype_Kullanimi_Overriding;

public class HAvciKuslar extends GKuslar{

        public void hareket() {
            System.out.println("ucarlar");
        }

        public void beslenme() {
            System.out.println("et yerler");
        }

        public void pence() {
            System.out.println("pencelidir");
        }

        public void gaga() {
            System.out.println("sivri gagali");
        }

    public static void main(String[] args) {
        HAvciKuslar kartalAvci = new HAvciKuslar();
        kartalAvci.hareket(); // H ucarlar
        kartalAvci.beslenme(); // H et yerler
        kartalAvci.pence(); // H pencelidir
        kartalAvci.gaga(); // H sivri gagalidir

        kartalAvci.kanat(); // G kanatlidirlar
        kartalAvci.solunum(); // G akciger
        kartalAvci.cogalma(); // G yumurtayla cogalirlar
        kartalAvci.omur(); // F yasar ve olurler

        System.out.println("==========");

        GKuslar kuslar = new GKuslar();
        kuslar.hareket(); // F hareket ederler
        kuslar.beslenme(); // F beslenirler
        //kuslar.pence(); // CTE
        kuslar.gaga(); // G gagalari vardir

        kuslar.kanat(); // G kanatlidirlar
        kuslar.solunum(); // G akciger
        kuslar.cogalma(); // G yumurtayla cogalirlar
        kuslar.omur(); // F yasar ve olurler

        System.out.println("===========");

        GKuslar kartalKus = new HAvciKuslar();
        kartalKus.hareket(); // H ucarlar
        kartalKus.beslenme(); // H et yerler
        //kartalKus.pence(); // CTE
        kartalKus.gaga(); // H sivri gagali

        kartalKus.kanat(); // G kanatlidirlar
        kartalKus.solunum(); // G akcigerle nefes alirlar
        kartalKus.cogalma(); // G yumurtayla cogalirlar
        kartalKus.omur(); // F yasar ve olurler

        System.out.println("===========");


        FHayvanlar hayvanlar = new FHayvanlar();
        hayvanlar.hareket(); // F hareket ederler
        hayvanlar.beslenme(); // F beslenirler
        //hayvanlar.pence(); // CTE
        //hayvanlar.gaga(); // CTE

        //hayvanlar.kanat(); // CTE
        hayvanlar.solunum(); // F nefes alirlar
        hayvanlar.cogalma(); // F cogalirlar
        hayvanlar.omur(); // F yasar ve olurler

        System.out.println("===========");

        FHayvanlar kartalHayvani = new HAvciKuslar();
        kartalHayvani.hareket(); // H ucarlar
        kartalHayvani.beslenme(); // H et yerler
        //kartalHayvani.pence(); // CTE
        //kartalHayvani.gaga(); // CTE

        //kartalHayvani.kanat(); // CTE
        kartalHayvani.solunum(); // G akciger
        kartalHayvani.cogalma(); // G yumurtayla cogalirlar
        kartalHayvani.omur(); // F yasar ve olurler


        /*
            Ozellikler method olarak olusturulmus ise
            data turu ve constractor ayni ise
            o class da aramaya baslarim
            İlk degeri kullanirim

            data turu ve constractor farkli ise

            data turu olan class dan aramaya baslar
            o class veya parent class larinda
            bulamazsa CTE verir

            o class veya parent class larinda bulursa,
            override edilmiş mi kontrol eder
            ve en guncel bilgiyi bulur ve
            yazdirmis olur
         */
        }
    }


