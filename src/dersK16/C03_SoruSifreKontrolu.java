package dersK16;

import java.util.Scanner;

public class C03_SoruSifreKontrolu {
    public static void main(String[] args) {

        /* Kullanıcıdaın bir şifre girmesini isteyin.
         * Girilen şidreyi aşağıdaki şartlara göre kontrol edin
         * Şifredeki hataları yazdırın
         * Kullanıcı geçerli bir şifre girinceye kadar bu işlemi tekrar edin
         * ve geçerli bir şifre girdiğinde şifreniz kabul edilmiştir yazdırın
         *
         * -şifre küçük harf içermelidir
         * -şifre büyük harf içermelidir
         * -şifre özel karakter içermelidir
         * -en az 8 karakter olmalıdır */

        Scanner scan = new Scanner(System.in);

        String sifre;
        boolean sifreDogruMu;
        int sonuc;

        do {
            sifreDogruMu = true;
            System.out.println("Lütfen bir şifre giriniz:");
            sifre = scan.nextLine();

             sonuc= kucukHarfKontroluYap(sifre);
            if (sonuc == 0) {
                System.out.println("Şifre küçük harf içermeli");
                sifreDogruMu = false;
            }

            sonuc = BuyukHarfKontroluYap(sifre);
            if (sonuc == 0) {
                System.out.println("Şifre büyük harf içermeli");
                sifreDogruMu = false;
            }

            sonuc = OzelKarakterKontroluYap(sifre);
            if (sonuc == 0) {
                System.out.println("Şifre özel karakter içermeli");
                sifreDogruMu = false;
            }

            sonuc = UzunlukKontroluYap(sifre);
            if (sonuc == 0) {
                System.out.println("Şifre en az 8 karakter olmalı");
                sifreDogruMu = false;
            }


        } while (!sifreDogruMu);
//ahmet hoca bayraklar koydu hata yoksa ++verdi  bayrak 4 olduğunda şifre başarılı olacak ve loopdan çıkacak
        String sistemSifresi = sifre;
        System.out.println("Şifre Başarılı bir şekilde kaydedilmiştir.");
    }

    private static int UzunlukKontroluYap(String sifre) {
        if (sifre.length() >= 8) return 1;
        else return 0;
    }

    private static int OzelKarakterKontroluYap(String sifre) {

        int bayrak = 0;
        for (int i = 0; i < sifre.length(); i++) {

            if (!(sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') && !(sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z')) {
                bayrak++;
                break;
            }
        }
        if (bayrak == 0) return 0;
        else return 1;
    }


    private static int BuyukHarfKontroluYap(String sifre) {

        int bayrak = 0;
        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                bayrak++;
                break;
            }
        }
        if (bayrak == 0) return 0;
        else return 1;
    }

    private static int kucukHarfKontroluYap(String sifre) {

        int bayrak = 0;
        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                bayrak++;
                break;
            }
        }
        if (bayrak == 0) return 0;
        else return 1;

    }
}