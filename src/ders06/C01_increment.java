package ders06;

public class C01_increment {
    public static void main(String[] args) {

        int sayi = 10;

        System.out.println(sayi = sayi + 3);//13

        System.out.println(sayi);//13

        System.out.println(sayi -= 5);//8

        System.out.println(sayi);//8

        System.out.println(sayi++);//8önce yazdırır sonra arttırır

        System.out.println(sayi);//9

        System.out.println(++sayi);//10önce arttırır sonra yazdırır
    }
}
