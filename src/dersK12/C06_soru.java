package dersK12;

public class C06_soru {
    public static void main(String[] args) {
        /*Kullanıcıdan pozitif bir sayı alın
        1den başlayarak tüm sayıları yazdıırn
        3 ile bölünebilen sayı yerine fizz
        5 ile bölünebilen sayılara buzz
        hem 3 hem 5se fizzBuzz yazdırın
        * */
        int sayi= 130;

        for (int i = 1; i <=sayi ; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("fizzBuzz\n");
            } else if (i%3==0) {
                System.out.print("fizz ");
            } else if (i%5==0) {
                System.out.print("Buzz ");
            }else {
                System.out.print(i + " ");
    }
}
    }
}
