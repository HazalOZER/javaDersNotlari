package ders07;

public class C02_operators {
    public static void main(String[] args) {
        int a=20;
        a=a+10;
        /*Javada = işaretiassigment işaretidir. bu işaret sağdaki değeri soldkai variablea atama yapar */

        int b=20;

        //a ile b eşit mi sorusu çitr== ile yapılır
        System.out.println(a == b);//false
        System.out.println(a == b + 10);//true

        boolean c= 20== b;
        System.out.println(c);//true

    }
}
