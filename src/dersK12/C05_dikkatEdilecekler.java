package dersK12;

public class C05_dikkatEdilecekler {
    public static void main(String[] args) {

        /*  Sonsuz loop
        for (int i = 0; i >-10; i++) {
            System.out.print(i +" ");
        }
        */


        // ilk değer icin bitiş şartı true olmuyorsa
        // for body'si hic devreye giremez

        for (int i = 0; i >10 ; i++) {

            System.out.println(i);
        }

        //Bir loopuun sonunu beklemeden bitirmek istersek
        //kullanıcııdn verdiği sayının asal olup olmadığını bulun

        int sayi=103;

        boolean asalMi=false;

        for (int i = 2; i <sayi; i++) {
            if (sayi%i==0){
                asalMi=true;
                break;
            }
        }
        if (asalMi) System.out.println("Sayı asal değil");
        else System.out.println("Sayı asal");

//int bayrak 0 da yapılabilirdi hem kaç böleni var da bunabilir bayrak++ bayrak 0 sa asal

    }
}
