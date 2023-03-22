package Ders36_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked Exceptions kod yazilir yazilmaz, daha run etmeden
            javanin riskli kodlari tanimlayip,
            calistirmadan once bana bir yol gostermelisin dedigi
            exception turleridir.

            Checked Exceptions genelde dosya okuma ve yazma IO islemlerinde olusur

            IO exception olusma ihtimaline karsı
            kodu yazar yazmaz java altini kırmizi cizer

            Checked exception kodun altini kırmızı cizdiginden
            kodumuzun calisir hale gelmesi icin kirmizi cizgiyi
            kaldirmamiz lazim

            1- try catch blogu kullanilarak
                exception handle edilebilir
                ve javaya exception olustugunda ne yapmasini istedigimiz gösterilebilir

            2-  Eger exception'i handle etmek istemiyorsak
            sadece kodumuzun calismasini istiyorsak
            method deklarasyonuuna

         */

        String dosyaYolu= "src/Ders36_Exceptions/text.txt";

        FileInputStream fis = new FileInputStream(dosyaYolu);



    }
}
