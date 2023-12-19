package dersK11;

public class C05_repeat_trim {
    public static void main(String[] args) {
        String str="Java Candır.";
        System.out.println(str.repeat(5));//Java Candır.Java Candır.Java Candır.Java Candır.Java Candır.

        str="   Java güzeldir      ";

        System.out.println(str.length());//22

        str= str.trim();//baştaki ve sondaki boşlukları siler

        System.out.println(str);

        System.out.println(str.length());//13

    }
}
