package dersK17;

public class C01_LocalVariables {
    public static void main(String[] args) {

        int sayi = 10;
        String isim = "Kamil"
                ;
    /* Bir methodun içerisinde oluşturulan variableların scopu
    * içinde oluşturdukları methoddur
    * o methodun dışında ulaşılamamzdlar*/

        for (int i = 0; i < 10; i++) {
            String adres = "Antalya";
        }
        //System.out.println(adres);
        /*loopun içindeki oluiturulan variablelar
        sadece loop içinde kullanılır*/

        double pi;

        /*Local variblelar değer atanmadan oluşturulabilir
         ancak kullanılıamaz*/

        //static int sayiStatic= 20; Static keyword sadece class level'da kullanılabilir
        //metodların içersinde static varianle TANIMLANAMAZ

    }



    public static void method(){
        //System.out.println(sayi);
        //isim= "Hazal";
    }
}
