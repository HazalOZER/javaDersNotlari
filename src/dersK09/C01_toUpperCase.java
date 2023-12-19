package dersK09;

public class C01_toUpperCase {
    public static void main(String[] args) {
        String str= "Java Mutluluktur";
        System.out.println(str.toUpperCase());//JAVA MUTLULUKTUR
        System.out.println(str);//Java Mutluluktur
        str="ince mehmet";
        str=str.toUpperCase();
        System.out.println(str);//İNCE MEHMET

       // str=str.toLowerCase();

      //Tr karakter eklesin diye  System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")) );


    }
}
