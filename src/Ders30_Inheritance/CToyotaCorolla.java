package Ders30_Inheritance;

public class CToyotaCorolla extends BToyota{

    String lastik = "Lassa 205-55-15";
    String model= "Corolla";
    String yakit = "Corolla dizel, benz,nli ve elektrikli olabilir";

    public void motor (){
        System.out.println("Corolla araclar Turkiye de uretilen ");
    }
    public void uretimYeri(){
        System.out.println("Corolla araclar Turkiye de uretilir");
    }


    public static void main(String[] args) {
        CToyotaCorolla corolla = new CToyotaCorolla();
        System.out.println(corolla.lastik); // Corolla class - Lassa 205-55-15
        System.out.println(corolla.model); // Corolla class - Corolla
        System.out.println(corolla.yakit); // Corolla class -
        corolla.motor(); // Corolla class -
        corolla.uretimYeri(); // Corolla class -

        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.aku); // Toyota
        corolla.guvenlik(); // Toyota

        System.out.println(corolla.vites); // Araba



    }
}
