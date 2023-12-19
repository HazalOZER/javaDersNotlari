package dersK16;

public class C02_SoruTamKareMi {
    public static void main(String[] args) {

        /*Kullanıcıdan bir pozitif tamsayı alın
        * sayının tam kare olup olmadığını bulunuz
        * tamkare ise true değilse false yazdırın
        * örnek input:16 output:4*/

                //NEDEN HATA VAR BAŞLANGIÇ ARTMIYOR
        int inp=16;
        int baslangic=1;
        int bayrak=0;

        do {
            if (baslangic*baslangic ==inp) {
            System.out.println("true");
            bayrak++;
            break;
            }
            baslangic++;

        }while (baslangic*baslangic<=inp);

        if (bayrak==0) System.out.println("False");
    }
}
