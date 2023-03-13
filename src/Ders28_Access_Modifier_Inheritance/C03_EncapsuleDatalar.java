package Ders28_Access_Modifier_Inheritance;

public class C03_EncapsuleDatalar {

    static private String isim= "Yildiz Pazarlama";



    private int satisTutari;

    public int getToplamSatis() {
        return toplamSatis;
    }

    public void setToplamSatis(int toplamSatis) {
        this.toplamSatis = toplamSatis;
    }

    private int toplamSatis;
    public int a;

    public static String getIsim() {
        return isim;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;

        toplamSatis+= satisTutari;
    }
}
