package dersK08;

public class C04_ternary {
    //Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alıp
    //uçgen eşkenat mi değil mi yazdır
    public static void main(String[] args) {

        int kenar1=5;
        int kenar2=6;
        int kenar3=56;

        System.out.println(kenar1>0&&kenar2>0&&kenar3>0&&kenar1==kenar2&&kenar2==kenar3?
                "Eşkenar üçgen": "Eşkenar Üçgen Değil");
        int sayi1=24;
        int sayi2=24;
        System.out.println(sayi1>sayi2? sayi2:sayi1);//büyük olmayan sayıyı yazdır(küçük veya eşit olan yani)
    }
}
