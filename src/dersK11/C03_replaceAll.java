package dersK11;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str="J1ava2 G9üzel5dir9";

        //strdaki sayıları silip Java güzeldir yazdırın

        //str.replaceAll(); sadece 1 harf veya char sequencei değil
        //genelleme diyebileceğimiz ortak özelliklerdeki tüm karakterleri değiştirir

        /* \\s:space
        * \\S:Space olmayan
        * \\s+: yanyana birden fazla space
        * \\d:digits
        * \\D:digits olmayan
        * \\w: harf veya rakam
        * \\W:harf veya rakam olmayan her şey
        */

        System.out.println(str.replaceAll("\\d", ""));//Java güzeldir
        System.out.println(str.replaceAll("\\D", ""));
        String s1="İlk ürün fiyatı: 1250TL.";
        String s2="İkinci ürünün fiyatı : 1500Tl";

        s1=s1.replaceAll("\\D","");
        s2=s2.replaceAll("\\D","");
        System.out.println(s1+s2);//12501500
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));//2750
    }
}
