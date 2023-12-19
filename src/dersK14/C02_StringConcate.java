package dersK14;

import java.util.Scanner;

public class C02_StringConcate {
    //verilen 2 stringi parametre olarak kabul ediğ
    //bu iki stringi aralarında bir boşluk olan tek bir string olarak
    //main metoda döndüren metod oluşturun

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("İki farklı metin girin");
        String str1= scan.nextLine();
        String str2= scan.nextLine();
        System.out.println(concat(str1,str2));
        System.out.println(concat("Bu şekilde", "de oluyor"));
    }

    public static String concat (String str1, String str2){
        return str1+" "+str2;
    }
    }

