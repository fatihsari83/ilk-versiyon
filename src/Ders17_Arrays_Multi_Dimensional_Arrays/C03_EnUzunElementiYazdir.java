package Ders17_Arrays_Multi_Dimensional_Arrays;

public class C03_EnUzunElementiYazdir {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran
        // bir method olusturun.

        String []arr1 = {"Mahmut", "Burkay", "Veli","Ali","Emre"};

        enUzunEnKisaYazdir(arr1);

        String []arr2 = {"Mahmut", "Burkay", "Veli","Ali","Emre"};

        enUzunEnKisaYazdir(arr2);


    }

    public static void enUzunEnKisaYazdir(String[] arr){
        String enuzunKelime= arr[0]; // uzunluk 0
        String enkisaKelime=arr[0]; // uzunluk 0

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>enuzunKelime.length()){
                enuzunKelime=arr[i];
            }
            if (arr[i].length()>enkisaKelime.length()) {
                enkisaKelime = arr[i];
            }

            System.out.println("Array deki en uzun kelime :"  );
            System.out.println("Array deki en uzun kelime :");
        }



    }
}
