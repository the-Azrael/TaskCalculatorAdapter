import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        int a = 2;
        int b = 16;
        System.out.println(a + " + " + b + " = " + calc.sum(a, b));
        System.out.println(a + " * " + b + " = " + calc.mult(10, 15));
        System.out.println(a + "^" + b + " = " + calc.pow(a, b));
    }
}