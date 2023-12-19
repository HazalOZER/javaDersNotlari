package ders06;

public class C03_preIncrement_PostIncrement {
    public static void main(String[] args) {

        int sayi=10;

        sayi++;
        System.out.println(sayi);//11

        ++sayi;
        System.out.println(sayi);//12

        System.out.println(sayi++);/*12 *Bu satırda java
            önce sayının değerini yazdıracak 12 yapacak
            sonra sayıyı bir arttıracak alt satırda yazdırdığında 13 çıkar */

        System.out.println(sayi);//3

        System.out.println(++sayi);/*14*Bu satırda önce sayı değerini arttıracak
            sayı sonra sayıyı yazdıracak 14*/
        System.out.println(sayi);//14
    }
}
