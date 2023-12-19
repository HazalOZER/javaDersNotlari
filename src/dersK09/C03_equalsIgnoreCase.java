package dersK09;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        //Küçük Büyük harf duyarlılığını ortadan kaldırır

        String str1="Ali";
        String str2="ali";
        String str3="ALİ";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true

        System.out.println(str1.equalsIgnoreCase("Ali "));//false boşluk karakteri var

    }
}
