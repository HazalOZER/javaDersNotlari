package dersK17;

import java.util.Scanner;

public class C05_ObjectVariables {
    public static void main(String[] args) {
        //C03 classındaki instance variablelara nasıl ulaşılır
        //instance variableların diğer adı obje variablelıdır
        //instance variablelara obje üzerinden ulaşabiliriz

        Scanner scan= new Scanner(System.in);//scanner classından obje oluşturma
        C03_ObjectVariables pers1=new C03_ObjectVariables();//scanner örneğinin aynı mantığı
        //oluşutmak istediğimiz clas adı =new oluşturmak istediğimz class

        System.out.println(pers1.personelIsmi);
        System.out.println(pers1.personelYasi);
        System.out.println(pers1.personelTelefonu);

        System.out.println("***************");

        pers1.personelIsmi="Fatih";
        pers1.personelYasi=35;
        pers1.personelTelefonu="5555555555";

        System.out.println(pers1.personelIsmi);
        System.out.println(pers1.personelYasi);
        System.out.println(pers1.personelTelefonu);

        System.out.println("***************");

        C03_ObjectVariables pers2=new C03_ObjectVariables();

        pers2.personelIsmi="Kamil";
        pers2.personelYasi=25;
        pers2.personelTelefonu="456555555";

        System.out.println(pers2.personelIsmi);
        System.out.println(pers2.personelYasi);
        System.out.println(pers2.personelTelefonu);

        C03_ObjectVariables pers3=new C03_ObjectVariables();

        pers3.personelIsmi="Altun";
        pers3.personelYasi=65;
        pers3.personelTelefonu="456566855";

        System.out.println("***************");

        System.out.println(pers1.personelYasi);
        System.out.println(pers2.personelYasi);
        System.out.println(pers3.personelYasi);

    }
}

