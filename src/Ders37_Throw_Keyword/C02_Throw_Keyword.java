package Ders37_Throw_Keyword;

public class C02_Throw_Keyword {
    public static void main(String[] args) {

        String a=null;
        String b="";
        try{
        try {
            int c= a.length()+b.length();

        } catch (Exception e) {
            if (b.length()==0){
            throw new RuntimeException();
        }
            System.out.println("Null point vardir islem yapilamaz");

    }
    }catch (RuntimeException e){
            System.out.println("Throw Keyword calisti");
        }
}}

