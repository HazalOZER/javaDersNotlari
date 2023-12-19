package dersK16;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // 10,11,12 sayılarını toplayan while loop

        int sayi=10;
        int toplam=0;
        do {
            toplam+=sayi;

            sayi++;

        }while (sayi<=12);
    }
    /*do while loopun iki avantajı vardır
    * 1- Loop bodysi en az bir kere çalışın
    * (while loopda başlangç değeri uygun değilse loop bodysi hiç çalışmayabilir)
    * 2- while bitiş kontrolü look kadar çalışır
    * (whileloopda bir kere çalışır)*/
}
