package dersK14;

public class C05_SubstringOlustur {


    /*Kullanicidan input olarak verilen bir String,
    baslangic ve bitis indexlerine gore baslangic index'i dahil,
     bitis index'i haric olacak sekilde aradaki harfleri yazdiran
     bir method olusturun.
     kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse,
     hata mesaji verin-
     kullanici str'da olan index'lerden daha buyuk bir index girerse
      hata mesaji yazdirin.*/
    public static void main(String[] args) {
        String inp="Java hızla ilerliyor";
        int baslangicIndeksi=5, bitisIIndeksi=8;
        kendiSubsitringMetodu(inp,baslangicIndeksi,bitisIIndeksi);//hız
        kendiSubsitringMetodu("Java",1,3);//av
        kendiSubsitringMetodu("deneme",6,3);
        kendiSubsitringMetodu("Java",6,8);

    }
    public static void kendiSubsitringMetodu(String inp, int baslangicIndeksi, int bitisIndeksi){

        if (baslangicIndeksi>bitisIndeksi) System.out.println("Başlangıç indeksi bitiş indeksinden büyük olamaz");
        else if (bitisIndeksi>inp.length()-1) System.out.println("Bitiş indeksi Stringin Sınırları Dışında");
        else {
            for (int i = baslangicIndeksi; i <bitisIndeksi; i++) {
                System.out.print(inp.charAt(i));
            }
            System.out.println("");
        }
    }
}


