package Ders30_Inheritance;

public class HChild extends GParent{

    protected int sayiChild;

    HChild(){
        System.out.println("Child class constructor calisti");
    }

    public static void main(String[] args) {
        HChild objChild= new HChild();
        System.out.println(objChild.sayiChild);
        System.out.println(objChild.sayiParent);
        System.out.println(objChild.sayiGrandParent);

        /*
            Child class dan olusturdugumuz bir obje parent ve Grandparent class
            larındaki tum ozelliklere sahip olur.

            bir obje olusturuldugunda ilk degerleri alabilmesi icib
            MUTLAKA BIR CONSTRUCTOR calismalidir.

            Constructor call bizim cok kullandıgımız bir ozellik degildir
            ancak inheritance i tam olarak anlayabilmek icin
            constructor call konusunu bilmemiz lazim

            Bu class dan obje olusturmak icin
            HChild( constructor ini kullandik
            AMA objemiz parent ve grandparent daki
            ozellikleri sahiplendi.

            Peki bu nasil oldu?

            Her ne kadar objeyi child class dan olustursak da
            nu objenin parent ve grandparent class larindaki ozellikleri
            alabilmesi icin o class larin cons lari da calismak ZORUNDADIR.

            java bu mecburi calismayi saglayabilmek icin
            cok ozel bir sistem gelistirmistir.

            bunun adı super() : super constructor call'dir
         */
    }
}
