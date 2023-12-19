package dersK13;

public class C03_nestedForLoop {
    public static void main(String[] args) {
        //1-4 sayısı arasındaki
        //sayılar için çarpım tablosu oluşturun

        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");

        }
    }
}
