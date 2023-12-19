package ders03;

import java.util.Scanner;

public class C02_scanner {
    public static void main(String[] args) {
        //Kullanıxıdan dairenin yarıçapını alıp alanını
        //hesaplayın ve yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Dairenin Yarıçapını Giriniz ");

        double yaricap=scan.nextDouble();

                //alanını hesapla ve yazdır
        double daireAlani=3.14 * yaricap*yaricap;
        System.out.println("Dairenin alanı : " +daireAlani);

    }
}
