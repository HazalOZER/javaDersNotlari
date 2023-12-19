package dersK12;

public class C04_rakamlarToplami {
    public static void main(String[] args) {

        //Kullanıcının veridği sayının rakamalr toplamını bul

        long sayi=153654654;
        String sayiStr=""+sayi;
        long birlerBasamagi=0, rakamlarToplami=0;

        for (int i = 1; i <= sayiStr.length(); i++) {
            birlerBasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlarToplami);

    }
}
