package dersK14;

public class C03_stringTerseCevirme {
    /*
    * parametre olarak bir String kabuş edip Stringin
    * terse çevrilmiş haline dönüştüren metod oluşturun*/

    public static void main(String[] args) {
        String inp="Java kod yazdıkça öğrenilir";
        System.out.println(ters(inp));
    }
    public static String ters (String inp){
      String tersInput="";

        for (int i = inp.length()-1; i >=0; i--) {
        tersInput+=inp.charAt(i);

        }
        return tersInput;
    }
}
