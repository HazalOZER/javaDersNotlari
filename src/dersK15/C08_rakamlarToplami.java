package dersK15;

public class C08_rakamlarToplami {
    //WhileLoop kullanarak kullanıcıdan alınan rakamın toplamını bulun

    public static void main(String[] args) {
        int sayi=2021;
        int sayiKalan=sayi;
        int rakam=0,rakamlarToplami=0;
        while (sayiKalan!=0){
            rakam=sayiKalan%10;
            rakamlarToplami+=rakam;
            sayiKalan/=10;
        }
        System.out.println(sayi+" değerin rakamaları toplamı "+rakamlarToplami);

    }

}
