package dersK10;

public class C02_contains {
    public static void main(String[] args) {


        String str="Java ile kodlama çok zevkli";

        System.out.println(str.contains("çok"));//true

        //charSequens=karakter dizisi

        str.contains("a");//true
        //str.contains('j') char (tek tırnak içinde) kabul etmez
        System.out.println(str.contains("java"));//false case sensetive

        String str2="Java";
        System.out.println(str.contains(str2));//true



    }
}