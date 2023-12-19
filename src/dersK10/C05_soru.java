package dersK10;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {
        /*mail kontrolü yapan bir program hazırlayın
         * 1-mail @ işareti içermiyorsa "geçersiz email" yazdır
         * 2-@ içeriyor ama @gmail.com içermiyorsa gmail adresi girniz yazdır
         * 3-Gmail.com ile bitmiyorsa yazım hatası şeklinde sonuç yazdırın
         * */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Gmail adresinizi giriniz:");
        String email=scan.nextLine();

       if (!(email.contains("@"))) {
           System.out.println("Geçersiz e-mail");
        }else if (!(email.contains("@gmail.com"))){
           System.out.println("Lütfen gmail adresi giriniz");
       } else if (!(email.endsWith("gmail.com"))) {
           System.out.println("Yazım Hatası");
       }else System.out.println("e-mail başarılı bir şekilde oluşturuldu");

    }
}
