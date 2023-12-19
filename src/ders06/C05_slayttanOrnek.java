package ders06;

public class C05_slayttanOrnek {
    public static void main(String[] args) {
        int a=10;
        System.out.println("A'nın değeri: "+ ++a);//11*önce A'yı arttırdı sonra yazdı
        int b = a++;//Önce atamma sonra arttırma 11i atadı sonra a yı 12 yaptı
        System.out.println("B'nin değeri: "+b);//11önce yazdırdı sonra arttırdı
        int c=b++ +a;
        System.out.println("C'nin değeri : "+c);//23 *a=12+b=11
        System.out.println("Son toplam: " + (a + b + c));//47=12+12+23

    }
}
