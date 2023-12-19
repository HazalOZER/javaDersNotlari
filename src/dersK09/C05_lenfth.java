package dersK09;

public class C05_lenfth {
    public static void main(String[] args) {
        String str= "Uzunkavaklaraltındauyurdururadam";
        System.out.println(str.length());//32

        //son karakteri yazdırın

        System.out.println(str.charAt(31));//m
        System.out.println(str.charAt(str.length()-1));//m

        //sondan üçüncü
        System.out.println(str.charAt(str.length()-3));//d

    }
}
