package Ders35_Interfaces;

public class C01_ChildOfI01 implements I01_Interface {
    @Override
    public void toplama() {
    }

    @Override
    public void cıkarma() {   }

    @Override
    public String ekleme() {       return null;
    }
   @Override
    public int faktoryel() {
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(I01_Interface.str);
    }
}
