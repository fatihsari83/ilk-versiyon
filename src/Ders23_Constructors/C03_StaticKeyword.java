package Ders23_Constructors;

public class C03_StaticKeyword {
    static String hastaneIsmi = "Yildiz Hastanesi";
    static  String hastaneTelefonu="3123659878";
    static  String bashekimIsmi="Kemal Aydin";

    String persIsmi;
    String perAdresi;
    String perTelefonu;

    public static void main(String[] args) {

        C03_StaticKeyword personel1= new C03_StaticKeyword();

        System.out.println(personel1.persIsmi); // null
        System.out.println(hastaneIsmi); //Yildiz
        System.out.println(personel1.bashekimIsmi); // kemal



        C03_StaticKeyword personel2= new C03_StaticKeyword();

        personel2.persIsmi="Dogan";
        System.out.println(personel2.persIsmi); // dogan
        System.out.println(personel1.persIsmi); // null

        personel2.bashekimIsmi="Sumeyra Gunel";
        System.out.println(personel1.bashekimIsmi);






        /*
            1- Static variableler tum class icin gecerlidir(class variable)
            2- Static variable ler tum objeler ıcın ayni degeri tasidikleri
                icin her obje icin ayrica olusturulmaz, sadece 1 variable olur.
            3- static variable lara ulasmak veya update etmek icin obje ismi kullanmaya
                gerek yoktur.
                Baska class tan static variable a ulasmak icin classismi.staticVariableIsmi yazilir

         */
    }
}
