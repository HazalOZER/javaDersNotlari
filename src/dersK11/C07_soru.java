package dersK11;

public class C07_soru {
    public static void main(String[] args) {
        /*Kullanicidan isim ve soyismini ayri ayri alin.-
         1-ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
         2-soyisim eşit veya daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.*/

        String name= "kamil", surname="öZER";

        if (name.length()>surname.length()) {
            System.out.println(name.toUpperCase().charAt(0)
                    +name.substring(1).toLowerCase()
                    +" "
                    + surname.toUpperCase().charAt(0)
                    +surname.substring(1).toLowerCase());
        }else {
            System.out.println(name.toUpperCase().charAt(0)
                    + name.substring(1).toLowerCase()
                    + " "
                    + surname.toUpperCase());
        }

    }
}
