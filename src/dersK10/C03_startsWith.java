package dersK10;

public class C03_startsWith {
    public static void main(String[] args) {
        String str="Mantı açarken java öğrenilmez";
        System.out.println(str.startsWith("manti"));//false case sensetive
        System.out.println(str.startsWith("M"));//True
        System.out.println(str.startsWith("Mantı açarken ja"));//true
        System.out.println(str.startsWith(""));//true-hiçlik

        System.out.println(str.startsWith("açarken", 6));//true-6. index ve sonrası
        System.out.println(str.startsWith("Mantı", 0));//true-0. index ve sonrası
        System.out.println(str.startsWith("java", 10));//false

    }
}
