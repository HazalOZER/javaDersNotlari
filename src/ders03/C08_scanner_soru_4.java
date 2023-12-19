package ders03;

import java.util.Scanner;

public class C08_scanner_soru_4 {

    //Kullanıcıdan bir diködrtgenin 2 kenar uzunluğunu alıp alanını yazdırınız

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen dikdörtgeninizin bir kenar uzunluğunu yazınız");
        double kenar1= scan.nextDouble();

        System.out.println("Lütfen dikdörtgeninizin diğer kenar uzunluğunu yazınız");
        double kenar2= scan.nextDouble();

        double alan=  kenar1*kenar2;

        System.out.println("Dikdörtgeninizin alanı:"+ alan);

    }
}
