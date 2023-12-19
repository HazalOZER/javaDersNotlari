package ders09;

import java.util.Scanner;

public class C03_ornek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Notunuzu Giriniz: ");

        double not = scan.nextDouble();

        if (not>100||not<0){
            System.out.println("Lütfen geçerli bir not giriniz");
        }else if (not>=85){
            System.out.println("AA");
        } else if (not>=65) {
            System.out.println("BB");
        } else if (not>=50) {
            System.out.println("CC");
        } else {
            System.out.println("DD");
        }

    }


    }

