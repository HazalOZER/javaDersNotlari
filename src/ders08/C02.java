package ders08;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        //Kullanıcıdan harf alın o harf ile başlayan bir ay varsa yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz:");
        char harf= scan.next().charAt(0);
        if (harf=='a'||harf=='A'){
            System.out.println("Ağustos Aralık");}
        if (harf=='o'||harf=='O') {
            System.out.println("Ocak");
        }
        if (harf=='ş'||harf=='Ş'||harf=='s'||harf=='S') {
            System.out.println("Şubat");}
        if (harf=='m'||harf=='M') {
            System.out.println("Mart Mayıs");}
        if (harf=='n'||harf=='N') {
            System.out.println("Nisan");}
        if (harf=='h'||harf=='H') {
            System.out.println("Haziran");}
        if (harf=='t'||harf=='T'){
            System.out.println("Temmuz");}
        if (harf=='e'||harf=='E'){
            System.out.println("Eylül Ekim");}
        if (harf=='k'||harf=='K'){
            System.out.println("Kasım");}
//Küçük büyük harfi or işaretiyle dahil et

    }}
