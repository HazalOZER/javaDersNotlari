package dersK22B;

import java.util.Arrays;

public class C03_ElemanlariYazdirmak {
    public static void main(String[] args) {

        int sayilar []= {1,2,3,4,5,6,7};

        //Arrayin tamamını yazdır.
        System.out.println(Arrays.toString(sayilar));//[1, 2, 3, 4, 5, 6, 7]

        //Arrayin tüm elementlerini yazdır.

        for (int i = 0; i < sayilar.length ; i++) {
            System.out.print(sayilar[i]+"-");//1-2-3-4-5-6-7-
//diziyi yazdıracaksak Arrays.toString ama dizinin tüm elementleri istenirse forloop

        }
    }
}
