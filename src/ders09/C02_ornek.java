package ders09;

import java.util.Scanner;

public class C02_ornek {
    public static void main(String[] args) {

        /*Kullanıcıdan notunu alın 50 veya daha büyükse
       "Sınıfı Geçtiniz" 50den daha küçükse "Maalesef sınıfta kaldınız" yazdırın
        * */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Notunuzu 100lük değer sisteminde giriniz.");
        double not=scan.nextDouble();

        if (not>=50){
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }else {
            System.out.println("Maalesef sınıfta kaldınız");
        }
    }
}
