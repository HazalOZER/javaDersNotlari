package dersK14;

public class C04_Tekrar {
    public static void main(String[] args) {
         int a=10, b=20;

         //bu iki sayının çarpımını yeni kod yazmadan yazdırın
        System.out.println(C01_Carpim.carpimMetodu(a, b));

        String c="Nasıl", d="yani?";

        System.out.println(C02_StringConcate.concat(c, d));

        String e="Bu da mı oldu?";

        System.out.println(C03_stringTerseCevirme.ters(e));

        //"bu cümleyi terse çevirin"
        System.out.println(C03_stringTerseCevirme.ters("Bu cümleyi Terse Çevirin"));


    }
}
