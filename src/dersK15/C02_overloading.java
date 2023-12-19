package dersK15;

public class C02_overloading {
    public static void main(String[] args) {
carpim(3,4);// metodcall sırasonda metod parantezine yazılana argüment denir
        carpim(3,4,5);
        carpim(2.4,6);
    }
    //metod overloading olan claslarda java hangisinin çalışacağına aiağıdaki şekilde karar verir
    //1 metod ismi
    //2-argüment sayısı ile parametre sayısına bakar
    //3 parametrelerin argümentle uyumuna bakar
    //4-minimum castinge bakar(int girmiş doublea çevirebilir ama çevirmeyen(casting) ,
    //hali varsa onu tercih eder


    public static void carpim(int sayi1, int sayi2) {
        System.out.println("iki integer sayının çarpımı:" + sayi1 * sayi2);
    }
    public static void carpim (int sayi3, int sayi4,int sayi5)
    { System.out.println("Üç integer sayının çarpımı:" + sayi3 * sayi4 * sayi5);}

    public static void carpim (double sayi3, int sayi4)
    { System.out.println("double-intiger sayının çarpımı:" + sayi3 * sayi4 );}
    public static void carpim (int sayi3, double sayi4)
    { System.out.println("double-integer sayının çarpımı:" + sayi3 * sayi4 );}
    public static void carpim (double sayi3, double sayi4)
    { System.out.println("double iki sayının çarpımı:" + sayi3 * sayi4 );}


}
