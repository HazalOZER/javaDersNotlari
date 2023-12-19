package dersK09;

public class C07_substring {
    public static void main(String[] args) {
        String str="Java gün geçtikçe güzelleşiyor";

        System.out.println(str.substring(5, 8));//gün 5dahil(inclusive) 8 hariç(exclusice)

        System.out.println(str.substring(9, 17));//geçtikçe

        System.out.println(str.substring(3, 7));//a gü

        String isim="HAzAN";
        //Verilen ismin ilk harfi büyük geri kalanlar küçük olarak kaydet

        isim=isim.substring(0,1).toUpperCase()+//ilk harfi büyük harf yaptık
        isim.substring(1).toLowerCase();//birici insek sonrasını kü.ük harf yaptı

        System.out.println(isim);//Hazan
        System.out.println(isim.substring(1, 3));//az
        System.out.println(isim.substring(3, 4));//a-char da olur ama String metodlarını kullanmak için bu uygulama daha efektif
                                    // , sadece 3. indexteki harfi yazdırır
        System.out.println("Yazdırmaz:"+isim.substring(2, 2));//Hiçbir şey yazdırmaz
        //System.out.println(isim.substring(5, 2)); hata verir geri gitmez

    }
}
