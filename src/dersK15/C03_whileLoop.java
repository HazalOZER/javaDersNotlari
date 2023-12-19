package dersK15;

import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {
        //Kullanıcıdan toplanmak üzere tamsayılar alın kullanıcı
        //sıfıra basarsa sayı alma işlemişni bitirin
        //kullanıcının kaç sayı girdiğini
        //ve bu sayıların toplamını yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen toplamak için bir tamsayı giriniz " +
                "\nBitirmek için sıfıra basınız.");

        int a=scan.nextInt();
        int sum=0, flag=0;
        while (a!=0) {

            sum+=a;
            a=scan.nextInt();
            flag++;

        }
        System.out.println("Sistemden çıktınız. " +
                "Girdiğiniz "+flag+ " adet değerin toplamı:" +sum);

    }
}
