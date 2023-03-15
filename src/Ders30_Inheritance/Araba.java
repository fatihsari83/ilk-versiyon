package Ders30_Inheritance;

public class Araba {

    // Marka gozetmeksizin tum arabaların sahip olacagı ozellikleri
    // bu class a koyarız

    String marka = "Tum arabalarin markasi olur";
    String model= "Tum arabalarin markasi olur";
    String vites = "Tum arabalarin vitesi olur";
    String yakit = "Tum arabalar yakitla calisir";

    public void uretimYeri(){
        System.out.println("Tum arabalar fabrikada uretilir");
    }

    public void motor(){
        System.out.println("Tum arabalarin motoru olur");
    }
}
