package ders05;

import java.util.Scanner;

public class C02_rakamlarToplami {

    public static void main(String[] args) {

        // Kullanıcıd;an alınan 3 basamaklı pozitif bir tamsayının rakamlar toplamı

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 3 basamaklı bir tam sayı giriniz: ");
        int num = scan.nextInt();//123

        int birlerBasamagi = num % 10;//123%10==>3 Kalanı verir

        int rakamToplami = birlerBasamagi;//3
        num = num / 10;//123/10==>12,3==>12

        birlerBasamagi = num % 10;//2
        rakamToplami = rakamToplami + birlerBasamagi;//3+2

        num = num / 10;//12/10==>1,2==>1
        birlerBasamagi = num % 10;//1
        rakamToplami = rakamToplami + birlerBasamagi;//3+2+1
        num = num / 10;//1/10==>0,1==>0 sıfırlanana kadar git
        birlerBasamagi = num % 10;//0
        rakamToplami = rakamToplami + birlerBasamagi;//3+2+1+0=6
        System.out.println("Girilen sayının rakamlar toplamı : " + rakamToplami);

    }
}
