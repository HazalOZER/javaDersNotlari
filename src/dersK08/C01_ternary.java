package dersK08;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double num= scan.nextDouble();
        //if
        if (num>0) System.out.println(2*num);
        else System.out.println(num+10);

        //ternary
        System.out.println(num>0 ? 2*num :num+10);

    }
}
