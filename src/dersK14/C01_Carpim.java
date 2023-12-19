package dersK14;

import java.util.Scanner;

public class C01_Carpim {
    //kullanıcıdan iki sayı alın
    //iki sayıyı parametre olarak kabul edip
    //çarpımlarını main metoda döndüren
    //bir metod oluşturun

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz: ");
        double num1= scan.nextDouble();
        double num2=scan.nextDouble();

        //System.out.println();

        System.out.println(carpimMetodu(num1, num2));

        double carpmaSonucu=carpimMetodu(3.5, 43.4);// ikikere çarpım metodu çalıştı yazar

    }

    public static double carpimMetodu( double num1, double num2){
        System.out.println("Çarpım metodu çalıştı");
        return num1*num2;
    }
}

