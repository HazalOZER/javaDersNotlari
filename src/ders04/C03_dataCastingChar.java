package ders04;

import java.util.Scanner;

public class C03_dataCastingChar {

    public static void main(String[] args) {

        //Ascii tablosu

        int a= 'a'+'b';//Ascii tablosu 97+98=195

        System.out.println(a);//195
        System.out.println('a'+'b');//195
        System.out.println(""+'a'+'b'); //ab

        //Kullanıcıdan bir char alın ascii tablosunda bu karakterden 3 karakteri yazdırınız

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir karakekter giriniz:");//a ile deneme

        char girilenKarakter=scan.next().charAt(0);

        System.out.println("Girilen Karakter: "+girilenKarakter);//a
        System.out.println("Girilen karakterin bir sonrası ascii table:"+(girilenKarakter+1));//98 (ascii tablosundaki n karakterinin sayısal değeri
        System.out.println("Girilen Karakterin bir sonrası: "+(char)(girilenKarakter+1));//b -bir sonrasını da karakter olarak isteniyorsa (char) diye belirtilmeli
        System.out.println("Girilen Karakterin iki sonrası: "+(char)(girilenKarakter+2));//c
        System.out.println("Girilen Karakterin üç sonrası: "+(char)(girilenKarakter+3));//d


    }
}
