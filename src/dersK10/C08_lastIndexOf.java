package dersK10;

public class C08_lastIndexOf {
    public static void main(String[] args) {
        String str="Java hafiften beyin yakıyor";

        System.out.println(str.lastIndexOf("a"));//21 string
        System.out.println(str.lastIndexOf('e'));//15 char
        System.out.println(str.lastIndexOf("Java"));//0
        System.out.println(str.lastIndexOf("java"));//-1 case sensetive
        System.out.println(str.lastIndexOf("e", 14));//11



    }
}
