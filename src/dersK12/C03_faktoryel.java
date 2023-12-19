package dersK12;

public class C03_faktoryel {
    public static void main(String[] args) {
        //Kullanıcının veridği sayının faktöriyerini bulalım
        System.out.println("");


        int num=5, faktoryel=1;

        for (int i = num; i >0 ; i--) {

            faktoryel=faktoryel*i;
        }
        System.out.println(faktoryel);//120


        //1den 100e kadar olan sayıları toplayın(sınırlar dahil)

        int toplam=0;

        for (int i = 1; i <=100; i++) {
            toplam=toplam+i;
        }
        System.out.println(toplam);//5050
    }
}
