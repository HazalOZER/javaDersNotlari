package dersK13;

import java.util.Scanner;

public class C08_metodOlusturma {

    public static void main(String[] args) {

        isteToplaYazdir();
    }
    /*
    * Kullanıcıdan 2 sayı alıp bunları toplayığ yazdıran metod oluşturun*/

    public static void isteToplaYazdir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();

        System.out.println("Girilen sayıların toplamı "+(num1+num2));
    }
}
