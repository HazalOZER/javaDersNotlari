package dersK22B;

import java.util.Arrays;

public class C04_SolaKaydir {
    public static void main(String[] args) {
        /*Soru: Verilen 3 Elemanlı bir Arrayin tüm elemanşarını
        bir soldaki konuma taşıyacak bir program yazdın
        Örn: array [1,2,3] Output [2,3,1]
        * */

        int arrayNum[]= {1,2,3,4,5};
        int num= arrayNum[0];

        for (int i = 0; i <arrayNum.length-1; i++) {

            arrayNum[i]=arrayNum[i+1];
        }
        arrayNum[arrayNum.length-1]=num;

        System.out.println(Arrays.toString(arrayNum));

        /*Yukarıda yaptığımız Arrayi işl duruma getirmek için sağa kaudoron*/

        num=arrayNum[arrayNum.length-1];

        for (int i = arrayNum.length-1; i >0; i--) {
            arrayNum[i]=arrayNum[i-1];
        }
        arrayNum[0]=num;
        System.out.println(Arrays.toString(arrayNum));
    }
}
