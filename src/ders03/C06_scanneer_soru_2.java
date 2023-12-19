package ders03;

import java.util.Scanner;

public class C06_scanneer_soru_2 {
    //Kullanıcıdsn bir double bir de int sayı alıp bunların toplamını ve çarpımını yazdırın

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Tam sayı değeri giriniz");
        int tamSayi= scan.nextInt();

        System.out.println("Kesirli sayı değerinizi giriniz");
        double kesirliSayi= scan.nextDouble();

        double toplam= tamSayi+kesirliSayi;

        double carpim= tamSayi*kesirliSayi;

        System.out.println("Girdiğiniz Değerlerin Toplamı;" +" "+toplam);

        System.out.println("Girdiğiniz Değerlerin Çarpımı;"+" "+carpim);

        //double verisinde kullanıcı sayı girerken virgüllü girmesi gerek . ve / denedim olmadı virgül ile girince oldu Örn:5,5

    }
}
