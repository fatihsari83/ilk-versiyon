package Ders38_Exception_garbageCollector;

public class C01_ThrowKeyword {
    public static void main(String[] args) {
        // sayi 0'dan kucukse sartli satirlar calismasin

        try {
            int sayi = -10;

            if (sayi <0){
                throw new IllegalArgumentException("Sayi negatif olmamali");

            }
            System.out.println("sartli calisacak satir 1");
            System.out.println("sartli calisacak satir 2");
            System.out.println("sartli calisacak satir 3");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("yola devam");
    }
}
