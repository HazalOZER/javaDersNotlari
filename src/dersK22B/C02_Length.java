package dersK22B;

import java.util.Arrays;

public class C02_Length {
    public static void main(String[] args) {
int sayilar []={1,2,3};
String harfler []= new String[4];
        System.out.println("Sayılar Array'inin uzunlığı: "+sayilar.length);
        //String.length()metodunda paranrez var Array.length de yok
        System.out.println(Arrays.toString(harfler));

        //harfler arrayinin son elementi
        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]);//diziden fazla index girdi verdik. Array Rıntime olduğu için kod çalışır ama hata verir
//ArrayIndexOutOfBoundsException
    }
}
