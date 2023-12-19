package dersK11;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str1="";
        //Str1e değer atanmıştır

        System.out.println(str1);//hiçlik yazdırır
        System.out.println(str1.concat("Java"));//java

        String str2;
        //str2 oluşturuldu ama değer atanmadı
        //System.out.println(str2);str 2ye bir değer atanmadığı için yazdırılamaz

        //System.out.println(str2.concat("Java")); yazdırılamaz
        str2="Java candır";
        System.out.println(str2.concat("."));//Java candır.

        String str3=null;
        System.out.println(str3);//null yazdıırr değer atanmamıştır. değer atanmadığını gösterir
        //System.out.println(str3.concat("java"));//NullPointerException hata verir

        //null deeğer değildir atanmaz, işaretleyicidir. Null işareti yapılır
        System.out.println(str3 + "java");//metod kullanılmaz sadece basit toplama işlemi ce sout yapılır.

        //Primitivlere null değeri atanmaz

    }
}
