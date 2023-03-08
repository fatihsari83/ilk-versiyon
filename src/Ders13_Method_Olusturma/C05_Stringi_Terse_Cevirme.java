package Ders13_Method_Olusturma;

public class C05_Stringi_Terse_Cevirme {
    public static void main(String[] args) {

        // Verilen bir String i tersine cevirip
        // bize donduren bir metod olusturun

        System.out.println(stringTersineCevir("Java Candir"));
        System.out.println(stringTersineCevir("Anlasıldı mi"));
        System.out.println(stringTersineCevir("Soyle Omer"));


    }


    public static String stringTersineCevir(String metin){ // Java
        String tersMetin= "";  // avaJ

        for (int i= metin.length()-1 ; i>=0; i--){

            tersMetin += metin.charAt(i);
        }

        return tersMetin;
    }
}
