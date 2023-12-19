package dersK11;

public class C06_soru {
    public static void main(String[] args) {
        /* Soru 1 : Kullanicidan bir cumle alin
        1- cumlede ev geciyorsa, "home home sweet home" yazdirin
        2- cumlede is geciyorsa, "calismak guzeldir"
        3- ikisini de iceriyorsa "Hem ev lazim hem is"
        4- hicbirini icermiyorsa "cok calisman lazim" yazdirin*/

        String input="eve geldim işler birikmiş";
        String inputCopy= input.toLowerCase();//case sensetive özelliğini geçmek için
        if (inputCopy.contains("ev")){
            if (inputCopy.contains("iş")) System.out.println("Hem ev lazım hem iş");
            else System.out.println("Home sweet home");
        }else if (inputCopy.contains("iş")) {
            System.out.println("Çalışmak Güzeldir");
        }else System.out.println("Çok çalışmak lazım");

    }
}
