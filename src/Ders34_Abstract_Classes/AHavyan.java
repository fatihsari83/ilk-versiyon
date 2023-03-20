package Ders34_Abstract_Classes;

public abstract class AHavyan {

    /*
    bir classı abstract class yapmak icin deklarasyona
    abstract keyword unu yazmak yeterlidir.

    Abstract classlar class oldukları ıcın constractor lari vardir.
    ama abstract class lardan obje olusturulmaz

    Abstract class larda bugune kadar kullandıgımız yapida metodlar
    olusturabiliriz ancak bunlar child class lar tarafından
    uyarlanmak(Override) zorunda olmaz.

    Child class ları uyarlamaya mecbur etmek istedigimiz methodları da
    abstract yapmalıyız.

    bir methodu abstract yapmak icin yine declation ile
    Abstract yazmak yeterlidir.
     */

    public abstract void hareket();

    public abstract void solunum();

    public abstract void beslenme();
    public abstract void cogalma();
    public abstract void omur();

}
