package dersK14;

public class C06_Soru {
    /*Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun
    input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz*/

    public static void main(String[] args) {
        String isim= "Kamil", soyisim="Altun";
        System.out.println(isimDuzenleme(isim,soyisim));

    }
    public static String isimDuzenleme (String name, String surname){
       return name.substring(0,1).toUpperCase()
               +(name.substring(1).toLowerCase())
               +" "
               +surname.substring(0,1).toUpperCase()
               +surname.toLowerCase().substring(1);
        //bunu varible olarak atayığ onu return diyebiliriz
        //örn String fixedName=........
        //return fixedName
    }
}
