class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of int: " + c.sum(10, 20));
        System.out.println("Sum of double: " + c.sum(10.5, 20.5));
    }
}
