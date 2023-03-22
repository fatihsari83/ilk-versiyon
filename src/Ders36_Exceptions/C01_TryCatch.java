package Ders36_Exceptions;

public class C01_TryCatch {
    public static void main(String[] args) {

        /*
            Kodlarimizi yazarken
            sorun olusma ihtimali gordugumuzde
            sorun cıkma potansiyeli olan kodlari
            try - catch - (finally) bloklari ile cevreleriz


         */

        int sayi1= 20;
        int sayi2= 0;


        try {

            System.out.println(sayi1 / sayi2);

        } catch (ArithmeticException e) {

            //e.printStackTrace();  exception a gordugumuz tum hata
            //                      acıklamalarını yazdirir.

           // System.out.println(e.getMessage());  by zero hatanin kaynagini gosterdi

           // System.out.println(e.getCause());

            //throw new RuntimeException(e);
        }

        /*
            Bir try-catch blogu 3 bolumden olsur.

            1- try blogu: 21-25(25 haric)
                exception olusturma potansiyeli olan kodlar

            2-  catch (Exception e)
                catch statement
                ArithmeticException : olusma ihtimali olan exception
                e : karsılastıgı exceptionu kaydedecegımız obje

            3-  catch blogu : 25(25 haric)-29 arasi
                ongorulen exception gerceklestiginde
                calismasini istedigimiz kodlar

         */
    }
}
