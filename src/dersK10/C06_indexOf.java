package dersK10;

public class C06_indexOf {
    public static void main(String[] args) {
        String str="Ahmet hoca ile her şey clear";

        System.out.println(str.indexOf("a"));//9 "a"nın bulunduğu ilk index

        System.out.println(str.indexOf('c'));//8 char da kabul ediyor

        System.out.println(str.indexOf("her şey"));//15 karakter öbeğinin ilk başladığı yer

        System.out.println(str.indexOf("e", 9));//13-9. indexten sonra aramaya başlar ilenin e'si
        //13. indexteki eden bir sonraki e nin indeksini

        System.out.println(str.indexOf("e",14));//16

        //cümledeki ikinci cnin indeksi

        int ilkCİndex=str.indexOf("c");//8
        System.out.println(str.indexOf("c", ilkCİndex + 1));//23

        System.out.println(str.indexOf("ali"));// olmadığını anlatabilmek için -1 döner
    }
}
