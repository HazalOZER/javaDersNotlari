package ders04;

public class C02_explicitNarrowing {

    public static void main(String[] args) {

        int a=128;

        byte b=  (byte) a;

        System.out.println(b);

        /* Daha geniş kapsamlı sayısal data türünden explixint Narowink daratlma yapmak istersek çevirmek istediğimiz
        türün sınırları içerisinde tekrar tekrar dönecektir.
         */
        //Byte -128den +127e kadar sayıları içerir 127den daha büyüj değer girildiğnde sayı doğrusunun başına gelip tekrar başlar
        //int 128 byte -128   int 256 byt 0 gibi yukarıdaki codeda test edebilirsin
    }
}
