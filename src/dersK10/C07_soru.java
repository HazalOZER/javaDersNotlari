package dersK10;

public class C07_soru {
    public static void main(String[] args) {
        /* Kullanicidan bir cumle ve bir metin alin
        cumlede metnin durumuna gore
        1- cumle metni icermiyor
        2- cumle metni sadece 1 kere iceriyor
        3- cumle metni birden fazla iceriyor seceneklerinden uygun olani yazdirin*/

       /*Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen metin giriniz");
        String text= scan.nextLine();
        System.out.println("Lütfen bir cümle giriniz");
        String sentence= scan.nextLine();*/

        String sentence="çok güzelsin çok. Seni veren Allah'a şükürler olsun";
        String text="çok";
        if (!(sentence.contains(text))){
            System.out.println("Cümle Metni İçermiyor");
        } else {
            int ilkIndex=sentence.indexOf(text);//0
            int ikinciIndex=sentence.indexOf(text,ilkIndex+1);
            if (ikinciIndex==-1) {
                System.out.println("Cümle metni sadece 1 kere içeriyor");
            }else {
                System.out.println("Cümle metni birden fazla içeriyor");
            }
        }


    }
}
