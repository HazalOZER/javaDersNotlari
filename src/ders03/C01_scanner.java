package ders03;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {
        //Kullanicidan ismini alıp sonra da yazdıralım
        // 1. adim scanner objesini olşuştur

        Scanner scan = new Scanner(System.in);

        //2. adim kullanıcıya ne istediğini söyleyin

        System.out.println("Lütfen İsminizi Giriniz");

        //3. adım :scan objesini kullanarak kullanıcıdan
        // bilgiyi alıp oluşturucağımız uyun bir variable'a kaydedelim

String kullaniciIsmi = scan.nextLine();
        //next() sadece ilk space'e kadar olan metni alırken
        //nextLine() tüm satırı alır

        System.out.println("Girilen kullanıcı ismi : " + kullaniciIsmi);
    }
}
