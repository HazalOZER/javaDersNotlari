package ders04;

public class C01_dataCasting {

    public static void main(String[] args) {

        /* byte<short<int<long<float<double
         * küçükten büyüğe çevirirlen hiçbir sıkıntı yok,büyük küçüğü kapsar*/

        int a = 134;
        double b = 23.6;
        short c = 34;
        byte d = 14;


        double e = a; //değerin data türü int, veriableın data türünden daha geniş

        int f = c;//değerin data türü<variableın data türü

        short g = d; // short>byte otomatik olarak çevirir (auto widenig)

        // short h=b; //variable data türü short<bnin data türü double hata verdi
        // byte l=a; //variablr data türü byte < anın data türü int
        // int m= b; //variable'ın data türü int < bnin data türü double
        //explicit data casting (Daratma)

        short h = (short) b;//b veriableındaki değeri ne olursa olsun shorta çevir demiş oluyor
        System.out.println("Double 23.4ün short karşılığı " + h);//23

        byte l = (byte) a;
        System.out.println("int 134ün byte karşılığı: " + l);//-122

        int m = (int) b;
        System.out.println("double 23.4ün int karşılığı " + m);//23

        /* Biz daha kapsamlı data türündeki bir değeri daha dar kapsamlı bir variablea atamak
         * istersek java bunu otomaktik olarak yapmayacaktır çünkü daha kapsamlıyı daha dar kapsamlı bir türe çevirmek
         * isterken data kayıpları olabilir veya java datayı yeni data türüne
         * çevirmek için değiştirebilir*/
    }
}