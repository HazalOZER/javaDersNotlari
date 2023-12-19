package dersK23B;

import java.util.Scanner;

public class C04_ArrayBoyutu {


    //HATA VAR BAŞTAN





    /*
    * Kullanıcıdan bir arrayin boyutunu ve tüm elementlerini alarak bir array
    * oluşturup bu arrayi bize döndüren bir method oluşturun*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Listeniz kaç elemandan oluşuyor: ");

        int num= scan.nextInt();

        System.out.println("Listenize eklemek istedikleriniz elemanları yazınız.\nHer eleman sonrasu entera basınız");

        String added= scan.nextLine();


    }

    public static String [] newList(int num, String added){
    String list [ ]=new String[num];

//list.add(added);


        String listAdded;
        for (int i = 0; i <=num ; i++) {

            //listAscan.nextLine();

        }


        return list;
    }
}
