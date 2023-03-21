package Ders35_Interfaces;

public interface I04_InterfaceIstısnalar {

    void toplama();

    static void aciklama(){
        System.out.println("Bu methodu impement etmek mecburi degil");
    }
    default void ekIsler(){
        System.out.println("Default keywor ile body si olan method oluşturulabilir");
    }
}
