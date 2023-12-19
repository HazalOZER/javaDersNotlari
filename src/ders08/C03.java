package ders08;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı al
        //sayı 3 ile bölünebiliyorsa 3 ile tam bölünebilen bir sayı
        //5 ile bölünebiliyorsa 5 ile tam bölünebilen bir sayı yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen tam sayı değeri giriniz");
        int sayi= scan.nextInt();

        if (sayi %5==0) {
            System.out.println("Girdiğiniz sayı 5 ile tam bölünebilir bir tam sayıdır");}
        if (sayi %3==0){
            System.out.println("Girdiğiniz sayı 3 ile tam bölünebilir bir tam sayıdır");}
        /*İf cümlesindenn sonra {} kullanılırsa if cümlesinden sonra
        if şartı sağlanmışsa {} tamamı çalışır şart sağlanmazsa {} içi hiç çalışmaz

        Ancak {} kullanılmazsa java if bodysi olarak if şartından sonra ilk ; kadar olan kısmı
                 alır geriya kalan kodlar if cümlesi olarak ilgilenmez
                 if süslü parantezine iki tane sout yaparsak ilk soutu if şartına tabi tutar ama
                 ikinci soutu şartsız çalıştır. Parantez kural olmasa da bu gibi durumlarda önemlidir*/
    }
}
