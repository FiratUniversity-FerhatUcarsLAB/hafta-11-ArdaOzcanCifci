public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {
        zippo("rattle", 13); // rattle kelimesi baffle metoduna gonderilen blimp parametresinin degeridir 
    }

    public static void baffle(String blimp) {
        System.out.println(blimp); // 2
        zippo("ping", -5); // 3
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop"); // 4
        } else {
            System.out.println("ik"); // 1
            baffle(quince); // motota gitti
            System.out.println("boo-wa-ha-ha"); // 5
        }
    }
}
/*
    Cikti :
    ik
    rattle
    ping zoop
    boo-wa-ha-ha

*/
