package dersK15;

import java.util.Scanner;

public class C06_soru {
    public static void main(String[] args) {
        /* Kullanicidan sifre isteyin
        asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
        sartlar :- sifrenin ilk karakteri kucuk harf olmali
        sifrenin son karakteri sayi olmali*/

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen yeni şifrenizi belirleyiniz" +
                "\nYeni şifrenin ilk karakteri küçük harf," +
                " son karakteri sayı olmalıdır");

        String password =scan.nextLine();

        while ((password.charAt(0)<'a'|| password.charAt(0)>'z')
                                      ||
                ((password.charAt(password.length()-1)<'0') ||(password.charAt(password.length()-1)>'9'))){

            System.out.println("Şifreniz istenilen şartları sağlamamaktadır. Şartlara uygun şifre giriniz");
            password=scan.nextLine();

        }
        System.out.println("Şifreniz başarılı bir şekilde kaydedilmiştir.");
    }
}
///hoca farklı çözdü

