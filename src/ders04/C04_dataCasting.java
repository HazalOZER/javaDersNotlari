package ders04;

import java.util.Scanner;

public class C04_dataCasting {

    public static void main(String[] args) {

        //kullanıcıdan iki tamsayı alıp bunları birbirine bölüp sonucu tam sayı olarak yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Bölünen Tam Sayıyı Giriniz");

        int bolunen=scan.nextInt();

        System.out.println("Lütfen Bölen Tam Sayılı Giriniz");

        int bolen= scan.nextInt();

        System.out.println("Girilen değerlerin bölümü:"+bolunen/bolen);/*15/4=3,75i int olduğu için 3 yazar sadece
        her iki sayı da in olduğu için java sonucu da int verir*/

        double sonuc=bolunen/bolen;//java önce sağ tarafı yapar yukarıdaki kuraldan dolayı sonu. yine 3 çıkar

        double dogruSonuc=(double)bolunen/bolen;

        System.out.println("double int hali sonuç"+sonuc);//3,0

        System.out.println("double doğru olarak sonuç"+dogruSonuc);//3,75

    }
}
