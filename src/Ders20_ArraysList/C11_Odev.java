package Ders20_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {

        // odev : verilen bir listede 2.indexteki elementlerin
        // yerini degistirip yeni listeyi bize donduren
        // bir metod olusturun

        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(3);
        sayilar.add(55);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);
        sayilar.add(8);
        sayilar.add(15);
        sayilar.add(19);
        sayilar.add(45);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen degistirmek istediginiz ındexleri birer bosluk bırakarak girin");
        int Index1 = scan.nextInt();
        int Index2 = scan.nextInt();

        List <Integer> ayiklanmisList = istenenIndexlerinYeriniDegistirme(sayilar,Index1,Index2);

        System.out.println(ayiklanmisList);

    }


    public static List <Integer> istenenIndexlerinYeriniDegistirme(List <Integer> sayilar, int Index1, int Index2){

        List <Integer> degistirilenIndex = new ArrayList<>();



        for (int i = 0; i < sayilar.get(i); i++) {

            int temp= sayilar.get(i);


            for (int j = 0; j < sayilar.get(j); j++) {
                sayilar.set(i, sayilar.get(j));
                sayilar.set(j,temp);

            }

        }
        return degistirilenIndex;

    }
}
