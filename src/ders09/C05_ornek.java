package ders09;

import java.util.Scanner;

public class C05_ornek {
    public static void main(String[] args) {

        /*Kullanıcıdan kilo(kg) ve Boyunu(cm) isteyip
        vücut kitle İndeksini hesaplayın(kilo*10000/(boy*Boy
        * vücut kitle indeksi
        * 30dan büyükse obez
        * 25-30 arası kilolu
        * 20/25 arası normal
        * 20den küçükse zayıf yazdırın*/
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz \nardından enter tuşuna basıp boyunuzu cm cinsinden giriniz");
        double kilo=scan.nextDouble();
        double boy=scan.nextDouble();

        double indeks=(kilo*10000)/(boy*boy);

        System.out.println(indeks);

        if (indeks>30){
            System.out.println("Obez");
        }
        if (indeks>25){
            System.out.println("Kilolu");
        }
        if (indeks>20){
            System.out.println("Normal");
        } else {
            System.out.println("Zayıf");
        }
    }
}
