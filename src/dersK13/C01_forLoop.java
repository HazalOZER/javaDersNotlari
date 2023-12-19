package dersK13;

public class C01_forLoop {
    public static void main(String[] args) {
        //Kullanıcıdan string isteyin ve tersten yazdırın

        String input="Java çok güzel";

        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(input.charAt(i));
        }
    }
}
