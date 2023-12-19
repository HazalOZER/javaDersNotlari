package dersK16;

public class C01_whileLoop {
    public static void main(String[] args) {
        //10-11-12 sayılarını toplayan bir whileloop oluşturun

        int a=10;
        int top=0;

        while (a<=12){
            top+=a;
            a++;
        }

        /*
        * while loopda 2 problem oluşabilir
        * 1- önce değer kontrol edip sonra işlem yaptığımızdan
        *   bodyde bşr kere daha kontrol etmemiz gerekir
        * 2- yapılan işlem sayısından 1 fazla while bitiş sartı kontrol edilir
        * 3- while loop öncesinde değeri kontrl edeceğimiz bir variable oluşturuyorsan
        *   ona yapacağımız atamayı dikkatli yapmamız gerekir
        *   yanlış değer ataması yapmak, whileloopun çalışmamasını neden olabilir*/
    }
}
