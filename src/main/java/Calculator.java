public class Calculator {

    public int sum(int x, int y) {
        System.out.println("Summa = " + (x + y));
        return x + y;
    }

    public int reside(int x, int y) {
        System.out.println("Residual = " + (x - y));
        return x - y;
    }

    public int divide(int x, int y) {
        System.out.println("Division = " + (x / y));
        return x / y;
    }

    public int multiply(int x, int y) {
        System.out.println("Multiplication = " + (x * y));
        return x * y;
    }
}
