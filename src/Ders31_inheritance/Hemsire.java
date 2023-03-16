package Ders31_inheritance;

public class Hemsire extends FMuhasebe{

    String unvan= "Hemsire";


    public void standrtMaas(){
        System.out.println("Hemsireler min 10000 TL maas alir");
    }

    public void ozelSigorta(){
        System.out.println("Hemsireler aylik 300 TL katki ile ozel sigorta yaptırabilir");

    }
    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*200);
    }

    public static void main(String[] args) {
        Hemsire hemsire=new Hemsire();
        hemsire.method();
    }

    public void method(){

        System.out.println(this.unvan); // hemsire
        System.out.println(super.unvan); // personel unvani
        System.out.println(this.sgkNo); // çalışan sgk no
        System.out.println(super.sgkNo); // çalışan sgk no
        this.standartMaas(); // 10000
        this.fazlaMesai(3); // 600
        super.fazlaMesai(4); // 600
        this.ozelSigorta(); // aylik 300
        super.ozelSigorta(); // personel

    }
}
