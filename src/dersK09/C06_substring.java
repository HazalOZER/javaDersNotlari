package dersK09;

public class C06_substring {
    public static void main(String[] args) {
        String str="Java öğren, işi kap";

        System.out.println(str.substring(5));//öğren, işi kap

        System.out.println(str.substring(0));//Java öğren, işi kap

        System.out.println(str.length());//19

        //son karakteri string olarak kaydedin
        String sonHarf=""+str.charAt(str.length()-1);//charı direkt string yapmadığı iin "" ekledik

        sonHarf=str.substring(str.length()-1);
        System.out.println(sonHarf);//p

        //Son karakteri Uppercase olarak yazdırın

        System.out.println(str.substring(str.length()-1).toUpperCase());//P
        //Son üç harfi büyük harf olarak yazdırın
        System.out.println(str.substring(str.length()-3).toUpperCase());//KAP

    }
}
