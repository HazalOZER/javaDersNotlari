package ders06;

public class C02_increment_decrement {
    public static void main(String[] args) {

        int sayi=10;
        //sayi değerini oluşturacağız b variablena atayalım
        //ve sonra sayı değerini 1 arttırlarım

        int b= sayi;
        sayi++;
        System.out.println(b);//10
        System.out.println(sayi);//11

        /*Bunu tek satırda yapabiliriz
        Satyı değerini c variableına atayacağız ve sonea sayı değerini 1 arttıralım
         */
        int c= sayi++;
        System.out.println(c);//11
        System.out.println(sayi);//12

        c=++sayi;
        System.out.println(c);//13
        System.out.println(sayi);//13
    }}
