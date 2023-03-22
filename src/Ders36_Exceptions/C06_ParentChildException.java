package Ders36_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildException {
    public static void main(String[] args) {

        String dosyaYolu= "src/Ders36_Exceptions/text.txt";

        FileInputStream fis = null;
        try {

            fis = new FileInputStream(dosyaYolu);
            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }

        /*
            Eger kodumuzda birden fazla exception ihtimali varsa
            ve bu exception lar arasında parent-child iliskisi varsa

            1- Ya sadece parent'i yazariz
               cunu parent exception, child exception'lari da kapsar
            2- Veya ikisini de yazmak istiyorsak
               once child exception'i
               sonra parent exception'i yazmaliyiz
         */
    }
}
















