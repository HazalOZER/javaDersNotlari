package dersK10;

public class C09_soru {
    public static void main(String[] args) {
        /* /* Kullanicidan bir cumle ve bir metin alin
        cumlede metnin durumuna gore
        1- cumle metni icermiyor
        2- cumle metni sadece 1 kere iceriyor
        3- cumle metni birden fazla iceriyor seceneklerinden uygun olani yazdirin*/

        String sentence="çok güzelsin çok. Seni veren Allah'a şükürler olsun";
        String text="çok";

        int ilkIndex=sentence.indexOf(text);//0
        int sonIndex=sentence.lastIndexOf(text);
        if (ilkIndex==-1){
            System.out.println("Cümle Metni İçermiyor");
        } else if (ilkIndex==sonIndex) {
                System.out.println("Cümle metni sadece 1 kere içeriyor");
        }else {
                System.out.println("Cümle metni birden fazla içeriyor");
            }
        }
    }

