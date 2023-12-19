package ders03;

import java.util.Scanner;

public class C05_scanner_soru_1 {

    //Kullanıcıdan üç farklı data türünde değer alıp girilen değerleri açıklamalarıyla yazdırın

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hangi Geometrik Şekli Seçtiğinizi Yazınız");
        String geometrikSekil = scan.nextLine();

        System.out.println("Lütfen Geometrik Şeklin Yüksekliğini Yazınız");
        double yukseklik = scan.nextDouble();

        System.out.println("Lütfen Geometrik Şekilden Kaç Adet İstedinizi Yazınız");
        int adet = scan.nextInt();

        System.out.println("Geometrik Şekliniz;"+" "+geometrikSekil+"" +
                "Seçtiğiniz Geometrik Şeklinizin Yüksekliği;"+" "+yukseklik+"" +
                "İstediğiniz Geometrik Şeklin Adedi;"+" "+adet);
    }
}
