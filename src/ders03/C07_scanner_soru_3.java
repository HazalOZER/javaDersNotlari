package ders03;

import java.util.Scanner;

public class C07_scanner_soru_3 {

    /*Kullanıcıdan ismini, soyismini ve yaşını alıp aşağıdaki formatta yazdırınız
     İsminiz: John
     Soyisminiz: Doe
     Yaşınız:40
     Kaydınız başarıyla tamamlanmıştır*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz:");
        String isim= scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz:");
        String soyisim= scan.nextLine();

        System.out.println("Lütfen Yaşınızı giriniz");
        byte yas= scan.nextByte();

        System.out.println("İsminiz:"+isim +"" +
                "\nSoyisminiz:" +soyisim +
                "\nYaşınız:" + yas +
                " \nKaydınız Başarıyla Tamammlanmıştır.");
    }
}
