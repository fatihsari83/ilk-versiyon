package Ders31_inheritance;

public class EPersonel {

    String isim= "personel isim belirtilmemiş";
    String unvan= "personel unvanı belirtilmemis";
    boolean izindeMi;


    public void standartMaas(){

        System.out.println("Personel asgari ucreti : " + 8500);
    }
    public void ozelSigorta(){
        System.out.println("Personelden katki payi alinarak ozel sigorta yapilir");
    }
}
