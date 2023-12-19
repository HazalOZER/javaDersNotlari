package dersK10;

public class C01_concatenation {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Güzeldir";
        boolean bl= true;
        double dbl=2.54;
        int num=20;

        System.out.println(str1 + bl + num);//Javatrue20
        //Strig dışındaki data türlerinin  toplama yapmanıza izin vermez
        //System.out.println(num+bl);

        //concet sadece string variablelarını birleştirmek için kullanuluır
       // System.out.println(str1.chars(bl));

        System.out.println(str1.concat(" ").concat(str2));//ilk konket boşluk ekliyor




    }
}
