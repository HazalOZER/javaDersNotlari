package dersK10;

public class C04_endsWith {
    public static void main(String[] args) {

        String str= "Java her yerde güzel";

        System.out.println(str.endsWith("güzel"));//true

        System.out.println(str.endsWith(""));//true-hiçlik

        System.out.println(str.endsWith("Java her yerde güzel"));//true

        System.out.println(str.endsWith("Java"));//false
    }
}
