package ders05;

public class C01_wrapperClasses {
    public static void main(String[] args) {

        String str="Kamil";
        System.out.println(str.toUpperCase());//KAMİL

        int sayip=20;

        //Primitive data türlerinin hazır metodları yoktur sadece değer içerir
        //Wrapper Classlar primitive data türü ile aynı değerleri barındırırken
        //değerler,yanında hazır metodlarda kullanmamıza imkan veren classlardır

        Integer sayiW=30;

        //sayiW. ile birçok metoda erişim var

        char karaP='a';

        Character karaW='b';

        System.out.println(Character.isDigit(karaP));//Sayı mı diye soruyor sonuç false

        System.out.println(Character.isLowerCase(karaP));//Küçük harf mi diye soruyor sonuç true

        String str2="1234";
        String str3="1000";

        System.out.println(str2+str3);//12341000 iki değeri kelime olarak algılar ve arka arkaya yazar

        System.out.println(Integer.valueOf(str2) + Integer.valueOf(str3));//2234

        System.out.println(sayiW.compareTo(Integer.valueOf(str2)));//-1 sayiW<str2

        str2="30";
        System.out.println(sayiW.compareTo(Integer.valueOf(str2)));//0 sayiW=str2

        str2="29";
        System.out.println(sayiW.compareTo(Integer.valueOf(str2)));//1 sayiW>str2

        String s = sayiW.toString();
        System.out.println(s);

    }
}
