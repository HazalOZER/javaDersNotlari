package dersK13;

public class C02_soru {
    public static void main(String[] args) {
        //Kullanıcıdan bir string alın ve terse çevir ve yazdır

        String str="Java her geçen gün güzelleşiyor";
        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);
        }
        System.out.println(tersStr);//royişellezüg nüg neçeg reh avaJ

    }
}
