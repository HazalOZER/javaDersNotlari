package dersK15;

public class C07_Soru {
    /*
    * Kullanıcıdan bir sayı ve hesaplamak istediği üstünü isteyin
    * while looğ kullanarak verilen sayının istenen üssünü hesaplayın yazdıran medot oluşturun*/
    public static void main(String[] args) {
        usHesap(2,0);
    }
    public static void usHesap (int sayi, int us){
        int sonuc=1;

       if (us>=0) {

           for (int i = 1; i <= us; i++) {
            sonuc*=sayi;}

           System.out.println(sonuc);

        }else System.out.println("Pozitif üs değeri giriniz");


    }

}
