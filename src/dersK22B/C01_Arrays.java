package dersK22B;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int sayilar []=new int[5];

        System.out.println(sayilar);// [I@6d03e736 referansı yazdırır. Stack memoride refarans vardır
        //Nonprimitive data türlerindeki dataları her zaman direkt yazdıramaybiliriz

        //Arrayi yazdırmak istersek javadaki arrays clasından yardım isteriz

        System.out.println(Arrays.toString(sayilar));//[0, 0, 0, 0, 0]
        sayilar[2]=10;
        sayilar[0]=3;
        sayilar[4]=5;
        System.out.println(Arrays.toString(sayilar));//[3, 0, 10, 0, 5]

        String sinifList[]={"Ali","Ayten","Hazal"};
        System.out.println(Arrays.toString(sinifList)); //[Ali, Ayten, Hazal]

        sinifList[1]=("Kamil");
        System.out.println(Arrays.toString(sinifList)); //[Ali, Kamil, Hazal]

    }
}
