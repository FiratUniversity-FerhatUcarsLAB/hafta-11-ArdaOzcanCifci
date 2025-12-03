
public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        return Math.exp(-x) + (1 - Math.exp(-x));
    }

    public static void main(String[] args) {
        double mult = multadd(1.0, 2.0, 3.0);
        double trigo1 = multadd(1.0 , Math.sin(Math.PI/4) , Math.cos(Math.PI/4) / 2);
        double trigo2 =  multadd(1.0 , Math.log(10), Math.log(20));
        System.out.println(mult);
        System.out.println(trigo1);
        System.out.println(trigo2);
    }
}

