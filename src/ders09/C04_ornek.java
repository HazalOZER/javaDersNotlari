package ders09;

import java.util.Scanner;

public class C04_ornek {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi=scan.nextInt();

        if ((sayi%5==0)&(sayi%3==0)) System.out.println("Süper Sayı");
        else if (sayi%5==0) System.out.println("Sayı 5 ile bölünebiliyor");
        else if (sayi%3==0) System.out.println("Sayı 3 ile bölünebiliyor");
        else System.out.println("Sayınız 3 veya 5 ile kalansız bölünemez");

        }
    }
