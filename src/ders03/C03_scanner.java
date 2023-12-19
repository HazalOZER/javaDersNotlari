package ders03;

import java.util.Scanner;

public class C03_scanner {
    public static void main(String[] args) {
        //Kullanıcıcıdan bir kelime isteyip kelimenin ilk harfini yazın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Bir Kelime Giriniz");

        char ilkHarf=scan.next().charAt(0);

        /*Javada string içerisindeki karakterler index ile tutulur
        örneğin kullanıcı Ali yazarsa
        0.index: A, 1. İndex:l 2. İndex: i

        scanner clas'ında scan.nextChar() yoktur
        bunun yerine scan.next() kullanılıp
        kullanıcının girdiği ilk kelimeyi alır;
        sonra charAt(0) kullanarak 0.indexDeki kelimenin
        ilk harfini alırız
        */

        System.out.println("Girilen kelimenin ilk harfi:" + ilkHarf);

    }
}
