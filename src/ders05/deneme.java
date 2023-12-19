package ders05;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        // Kullanıcıd;an alınan 3 basamaklı pozitif bir tamsayının rakamlar toplamı

        System.out.println("Lütfen 3 basamaklı bir sayı giriniz");
        //Scanner scan = new Scanner(System.in);

        //int num = scan.nextInt();

        int num=456;
        int basamak = num % 10;

        System.out.println(basamak);

        int toplam=0;
        toplam += basamak;
        System.out.println(toplam);

        num /= 10;
        System.out.println(num);
        basamak = num % 10;
        System.out.println(basamak);

        toplam+=basamak;
        System.out.println(toplam);

        num /= 10;
        System.out.println(num);
        basamak = num % 10;
        System.out.println(basamak);
        toplam+=basamak;
        System.out.println(toplam);









    }
}
