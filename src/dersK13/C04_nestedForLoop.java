package dersK13;

public class C04_nestedForLoop {
    public static void main(String[] args) {
        /* aşağıdaki şekli yazdırın
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *

         */

        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=6 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
