package dersK08;

public class C03_ternary {
    public static void main(String[] args) {
        int a=5;
        //a%2==0? "çift sayı":"Tek sayı"
        //Ternary operatörü tek başuna kullanılamaz
        //ternary bize sonuç verir bu sonu. ya yazdırılmalı ya da variablea atılmalı
        String sonuc=a%2==0? "çift sayı":"Tek sayı";
        /*Ternarynin sonucunu bir veriablea atayacaksak
        true ve false durumlarında üretilecek sonucun aynı dara
        türüne uygun olması gerekir
        aksi halde CTE oluşur
        *
        Ama Ternaryui sout içine yazarsak farklı variable olabilir
         */
        String sonuc2=a>10? "Büyük Sayı": ""+2*a;//int değeri ""+ ekleyerek stringe çevirdik
        System.out.println( a>10? "Büyük Sayı": 2*a);
    }}
