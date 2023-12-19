package dersK11;

public class C02_replace {
    public static void main(String[] args) {
        String str="Java candır";

        System.out.println(str.replace('a', 'A'));
        //JAvA cAndır

        System.out.println(str.replace(' ', '_'));
        //Java_candır

        System.out.println(str.replace("candır", "çok güzeldir"));
        //Java çok güzeldir

        System.out.println(str.replace(" ", ""));
        //Javacandır

        System.out.println(str.replace("a", ""));
        //Jv cndır

        System.out.println(str.replace("Java","Hava")
                                .replace("candır","çok güzel"));
        //Hava çok güzel

        System.out.println(str.replace("","_"));
        //_J_a_v_a_ _c_a_n_d_ı_r_

        System.out.println(str.replaceFirst("a", "A"));
        //JAva candır
    }
}
