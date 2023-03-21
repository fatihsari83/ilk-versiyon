package Ders35_Interfaces;

public class C03_ChildOfI04 implements I04_InterfaceIstısnalar{
    @Override
    public void toplama() {

    }


    public static void main(String[] args) {

        C03_ChildOfI04 obj = new C03_ChildOfI04();
        obj.ekIsler();// Default keywor ile body si olan method oluşturulabilir

        I04_InterfaceIstısnalar.aciklama();// Bu methodu impement etmek mecburi degil
    }
}
