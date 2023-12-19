package dersK15;

import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {
        /*
        * Kullanıcıdan toplanmak üzere sayı alın
        * satıların toplamı 500e eşit olur veya geçerse
        * girilen sayı adaedi
        * girilen sayılşarın toplamını ve
        * "bu kadar yeter" yazdır*/


        Scanner scan = new Scanner(System.in);

        int input=scan.nextInt();

        int sum=0, flag=0;

        while (sum<500) {

            sum+=input;
            input= scan.nextInt();
            flag++;
//500ü geçtikten sonra 1 değer daha almadan kapatmıyor ama sonucu doğru yazdırıyor.
            //Çözemedim

        }
        System.out.println("Bu kadar yeter.\nGirilen "
                +flag+" adet sayının toplamı: "+sum);
    }
}
