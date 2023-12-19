package dersK17;

public class C04_ClassVariables {

    public static void main(String[] args) {
        System.out.println(C03_ObjectVariables.hastaneIsmi);
        System.out.println(C03_ObjectVariables.hastaSayisi);
        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();
        System.out.println(C03_ObjectVariables.hastaSayisi);
    }

    public static void method1 (){
        C03_ObjectVariables.hastaSayisi++;
    }
}

/*Java runtime bir programdır. Çalımaya başladığında variablelara atanan değerleri işler çalıştıüı müddetçe yapılan değişiklikleri işler
* ancak çalışması bittiğinde */
