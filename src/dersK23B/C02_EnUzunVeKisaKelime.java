package dersK23B;

public class C02_EnUzunVeKisaKelime {

    /*Verilen String bir Arrayde en uzun ve en kısa
    * stringleri yazdıranan bir metod*/
    public static void main(String[] args) {

        String[]isimler={"Ali","Ayten","Hazal","Fatih","Kamil","Sümeyye"};

        longestAndShortest(isimler);

    }

    public static void longestAndShortest(String[] isimler){

       String longest=isimler[0],
               shortest=isimler[0];

        for (int i = 1; i < isimler.length; i++) {

            longest = isimler[i].length()>longest.length()? isimler[i] : longest;
            shortest =isimler[i].length()<shortest.length() ? isimler [i] : shortest;

        }
        System.out.println("Listedeki en uzun eleman: "+longest+
                            "\nListedeki en kısa eleman: "+shortest);
    }
}
