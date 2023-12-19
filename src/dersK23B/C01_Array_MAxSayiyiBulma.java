package dersK23B;

public class C01_Array_MAxSayiyiBulma {

    public static void main(String[] args) {

        /*Verilen bir int arraydeki en büyük
         * sayıyı yazdıran bir metod oluşturun*/

        int[] num = {1, 128, 3, 42, 15, 0, 65};
maxInArray(num);
    }

    public static void maxInArray(int[] sayilar) {
        int max=sayilar[0];

        for (int i = 1; i < sayilar.length ; i++) {

            max = (sayilar[i] > max) ? sayilar[i] : max;
        }
        System.out.println(max);
    }
}
