package Ders14_Methot_Overloading_While_Loop;

public class C03_Metod_OverLoading {
    public static void main(String[] args) {


        /*
          bir classta ayni isme sahip
          farkli islem yapan metodlar olabilir.
          Java bu metodlardan hangisinin calisacagina
          parametrelere gore karar verir.

          Bir classta ismi ayni, parametreleri farkli
          metodlar olmasina Method OVERLOADING denir.
         */

        String str= "Bu is olacak";

        System.out.println(str.replace("Bu is", "Java guzel")); // Java guzel olacak
        System.out.println(str.replace('u', 'e'));// Be is olacak
    }
}
