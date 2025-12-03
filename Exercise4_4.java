
public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        // cevap : int degerinde veri dondurmedigi icin compier hata veriyor.
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // cevap : operator void ve int degerlerini toplayamiyor ve compiler hata veriyor.


        // Cevaplarinizi yorum olarak ekleyin.
    }
}
