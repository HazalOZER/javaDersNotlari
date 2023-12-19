package ders09;

import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {
        /*soru1-),Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alıp
        üçgen eşkenar ise "Eşkaner Üçgen" yazdırın değilse
        "Eşkenar değil" yazdırın
        * */
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz. Girilen her değerden sonra enter tuşuna basınız.");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if ((kenar1==kenar2) && (kenar3 == kenar2)) {
            System.out.println("Eşkenar Üçgen.");
        }else {
            System.out.println("Eşkenar Üçgen Değil");}
        }

    }

