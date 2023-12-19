package dersK08;

public class C05_nestedTernary {
    public static void main(String[] args) {
        //Sayı poazitifse çif mi tek mi yazdır
        //sayı poz. değilse 3 basamaklı veya değil yazdır

        int sayi=-125;

        //hem if hem ternary karışık yaptım
        if (sayi>0){
            System.out.println(sayi%2==0? "Çift sayı" :"Çift sayı değil");
        }else {
            System.out.println(sayi<-99&&sayi>-1000? "Sayı üç basamaklı":"Sayı 3 basamaklı değil");
        }

        // sadece nested ternary ile

        System.out.println(sayi>0
                    ?
                    sayi%2==0? "Çift sayı" :"Çift sayı değil"
                    :
                    sayi<-99&&sayi>-1000? "Sayı üç basamaklı":"Sayı 3 basamaklı değil" );
    }
}
