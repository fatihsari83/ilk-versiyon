package Ders21_Array_List_Foreach_Loop;

public class C04_KareleriToplami {
    public static void main(String[] args) {


        //Soru 2- Verilen int array’deki her elementin karelerini
        // alip, karelerinin toplamini yazdiran
        // bir method olusturun.

        int []arr = {2,3,5,0,1};
        karelerToplaminiYzdir(arr);
    }

    public static void karelerToplaminiYzdir(int [] arr){

        int karelerToplami=0;

        for (int each:arr
             ) {

            karelerToplami+=each*each;
        }

        System.out.println("Verilen arraydeki elementlerin kareleri toplami : " + karelerToplami);
    }
}
