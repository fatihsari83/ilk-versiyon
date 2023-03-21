package Ders35_Interfaces;

public interface I01_Interface {

    int sayi =10;
    final String str = "Java Candir";
    public static final boolean b = true;

    // Interface de tum variable lar (Yazılmasa bile) public, static,
    // ve final dir. Final oldugu icin sonradan degistirme imkani yoktur.
    // Olustururken deger atanmalidir.
    // bu ozellikler standart olarak tum variable lara tanımlandıgından
    // bu tanımlamalari yapmak gerekli degildir (intellij gri yaptı)


    void toplama();
    public void cıkarma();
    abstract String ekleme();
    public abstract int faktoryel();
    // tum metodlarda da standart olarak public ve abstract tir.(yazılmasa bile)


}
