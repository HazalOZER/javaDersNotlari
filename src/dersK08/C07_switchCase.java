package dersK08;

import java.util.Scanner;

public class C07_switchCase {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        /*j:java
        D:devalepmet
        K:kit yazdır bşka harf verirse geçersiz
        * */
        System.out.println("Lütfen harf girin");
        char harf=scan.nextLine().charAt(0);
        switch (harf){
            case 'J':
            case 'j':
                System.out.println("Java");
                break;
            case 'D':
            case 'd':
                System.out.println("Devalepment");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz");



                /*long double float boolean kullanuılmaz*/
        }
    }
}
