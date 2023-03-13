package Ders27_String_Builder_Access_Modifier;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Candir");

        sb1.delete(4,5);
        System.out.println(sb1); // Javdir

        System.out.println(sb1.deleteCharAt(9)); // JavaCandi

        System.out.println(sb1); //JavaCandi

        sb1.insert(9,"r");
        System.out.println(sb1); //JavaCandir

        sb1.insert(4," ");
        System.out.println(sb1); // Java Candir

        String str = "can bize gelecekmis";
        sb1.insert(11,str,0,5);
        System.out.println(sb1); // Java Candircan b

        sb1.replace(12,15,"Can");
        System.out.println(sb1);//Java CandircCanb
    }
}
