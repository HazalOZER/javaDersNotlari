package dersK11;

public class C08_soru {
    public static void main(String[] args) {

       /* Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
       kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
       eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
       ilk harf kucuk harf olmali
       son karakter rakam olmali
       sifre bosluk icermemeli
       uzunlugu en az 10 karakter olmali */

        String input="hazalkamil21";

        int bayrak=0; //kaç olduğu önemsiz hata verdiği yerde 1 arttır

        if (!(input.charAt(0)>='a') &&(input.charAt(0)<='z')) {
            System.out.println("Şifrenin ilk harfi küçük olmalı");
            bayrak++;
        }
        if (!(input.charAt(input.length()-1)>='0'
                &&
                input.charAt(input.length()-1)<='9')){
            System.out.println("Şifrenizin son karakteri rakam olmalıdır");
            bayrak++;
        }
        if(!(input.equals(input.replaceAll("\\s","")))) {
            System.out.println("Şifre boşluk içermemelidir.");
            //(input.contains (" ")) şeklinde yaptı
            bayrak++;

        }
        if (!(input.length()>=10)) {
            System.out.println("Şifrenin uzunluğu 10 karakter olmalıdır.");
            bayrak++;
        }
        if (bayrak==0) System.out.println("Şifreniz başarıyla kaydedilmiştir");


    }
}
