package dersK11;

public class C04_replaceAll {
    public static void main(String[] args) {

        //kullanıcının girdiği metinden harf dışında kalan tüm karakterleri temizleten bir kod yazın
        //space silinmememeli

        String input="Ja5+va   gu_2ze-ld.ir";

        input=input.replaceAll("\\d","");//Ja+va   gu_ze-ld.ir
       //önce sayılardan kurtulduk

        input=input.replaceAll(" ","1");//Ja+va111gu_ze-ld.ir
        //boşluk yerine sayı ekledik, karakterleri silidğimizde boşluğun yeri durabilsin diye

        input=input.replaceAll("\\W","");//Java111gu_zeldir
        //Harf ve sayı hariç her şey silindi"ü"de özel karakter gibi algılıyor

        input=input.replaceAll("_","");
        //_ de W içine dahill bu yüzden silmez özel olarak silmek gerekir

        input=input.replaceAll("1"," ");//Java   guzeldir
        //koyduğumuz bir yerine boşluk yaptık 1 yerine \\d de yazabilirdik

        input=input.replaceAll("\\s+"," ");
        //arka arkaya birden fazla kez konulmuş spacei temizledik

        System.out.println(input);
    }
}
