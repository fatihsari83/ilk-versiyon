package Ders20_ArraysList;

public class C08_BaskaClassdanKullanma {
    public static void main(String[] args) {


        // verilen sayının pozitif tam bölenleri sayısı 10 dan çok ise güzel
        // yoksa kötü yazdırın

        int sayi= 100;
        int pozitiftamBolenlerSayisi=C07_tamBolenlerListesi.pozitifBolenleriListele(sayi).size();

        if (pozitiftamBolenlerSayisi>10){
            System.out.println("Guzel");
        }else {
            System.out.println("Kotu");
        }
    }
}
