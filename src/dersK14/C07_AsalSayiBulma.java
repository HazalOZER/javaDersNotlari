package dersK14;

public class C07_AsalSayiBulma {
 /* Kullanicidan main method icinde pozitif bir tamsayi alin.
 Girilen sayinin asal sayi olup olmadigini kontrol edip,
 sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
*/
 public static void main(String[] args) {
     int a=24;

     if(asalSayi(a)==0) System.out.println("Girilen değer asal sayı");
     else System.out.println("Girilen değer asal sayı değil");
 }
 public static int asalSayi(int num){
     int flag=0;
     for (int i = 2; i < num; i++) {

         if(num%i==0) flag++;

     }
     return flag;
 }
}
