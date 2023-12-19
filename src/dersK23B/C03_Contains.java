package dersK23B;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /*Kullanıcıdan aldığınız bir ismin verilen Arrayin istenilen sonucu içerip içermediğini kontrol edip
         * bize true veya False sonucu döndüren bir method oluşturun*/

        String isimler[] = {"Ali", "Ayten", "Ayşe", "Hüsniye"};

       if(contains(isimler)){
            System.out.println("Girilen İsim Listede Mevcut");
        } else {
           System.out.println("Girilen isim Listede Mevcut Değil");
       }

    }

    public static boolean contains(String isimler[]) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen kontrol için isim giriniz:");
         String isimScan = scan.nextLine();

        boolean isContain = false;

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(isimScan)) {

                isContain = true;
            }
        }


        return isContain;
    }
}
