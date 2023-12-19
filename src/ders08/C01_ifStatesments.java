package ders08;

import java.util.Scanner;

public class C01_ifStatesments {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı isteyiniz ve sayıyı kontrol edip 5 ile bölünebiliyorsa
        //sayı 5in tam katı yazdırıınız


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz:");
        int sayi= scan.nextInt();

        int kalan= sayi%5;
        boolean kontrol= kalan ==0;
        if (kontrol){
            System.out.println("giridiğiniz değer 5in katı");}

        //Hocanın yaptığı çözüm aşağıda
        if (sayi %5==0){
            System.out.println("Girilen sayı 5in katı");
        }



    }
}
