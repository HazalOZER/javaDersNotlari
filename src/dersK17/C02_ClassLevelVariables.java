package dersK17;

public class C02_ClassLevelVariables {

    /*class level variablelar instance
     * ve static olarak ikiye ayrılır
     * variable bütün onjeler için aynıysa static işaretlenir
     *  */

    static String hastaneIsmi= "Altun Hastanesi";
    static int hastaSayisi=56432;
    static String bashekim;
    String personelIsmi;
    String personelTelefonu;
    int personelYasi;

    public static void main(String[] args) {
        System.out.println(hastaneIsmi);
        System.out.println(bashekim);

        /*class level variablelara değer atanmaması yağılmamışsa
        * java bu variablelara data türüne göre default olarak tanımlanan değerleri atar
        * defoult değerler
        * sayısal variablelar 0
        * Boolean false
        * char ' '
        * Objeler (String...) null
        ***********
        * isim belli değilse değer atanmadı gibi bir yazı atasak daha güzel durur. ba++
        * başhekim karşısında null yazmasını kullanıcı anlamaz
        *  */

        //System.out.println(personelIsmi); statik olmadığı için static metodda kullanılalamz



    }
    public static void method1() {
        System.out.println(hastaneIsmi);
        hastaSayisi++;
        //System.out.println(personelIsmi);

    }
    public void method2 (){
        hastaSayisi++;
        System.out.println(hastaneIsmi);
        System.out.println(personelIsmi);
        System.out.println(personelYasi);

        //static olmayan variabllar static olmayan methodlarda kullanılır
    }

}
