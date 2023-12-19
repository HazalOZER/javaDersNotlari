package ders03;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ismini, soyismini ve yaşunu alıp
        ismin ilk harfi, soyisim, yaş şeklinde yazdırın
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen İsminizi Giriniz");
        String isim =scan.nextLine();

        System.out.println("Lütfen Soyisminizi Giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lütfen Yaşınızı Giriniz");
        int yas= scan.nextInt();

        System.out.println("Girilen Bilgiler:" +isim.charAt(0)
                + ", "
        +soyisim + ", " +yas);


    }
}
