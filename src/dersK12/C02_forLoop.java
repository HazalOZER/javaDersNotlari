package dersK12;

public class C02_forLoop {
    public static void main(String[] args) {
        //2 basamaklı sayılardan 7 ile bölünebilenler yazdırın
        System.out.println("\n-----------------");//sout("") hiçlik yazdırırsan da boşa atar
        for (int i = 10; i <100 ; i++) {
            if (i%7==0)
                System.out.print(i+" ");//14 21 28 35 42 49 56 63 70 77 84 91 98
        }
        //13den başlayıp y100e kadar yedişet arttır

        System.out.println("");
        for (int i = 13; i <=100; i+=7) {
            System.out.print(i+" ");//13 20 27 34 41 48 55 62 69 76 83 90 97
        }

        //1den 10a kadar (sınırlar dahil) sayıların karelerini yazdırın.

        System.out.println("");

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i*i+" ");//1 4 9 16 25 36 49 64 81 100
        }

    }
}
