package dersK08;

public class C02_ternary {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";//case sensetive

        //if
        if (str1.equals(str2)) System.out.println("Metinler Aynı");
        else System.out.println("Metinler Farklı");

        //ternary

        System.out.println(str1.equals(str2)? "Metinler Aynı":"Metinler Farklı");
    }
}
