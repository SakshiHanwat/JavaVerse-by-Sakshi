// Compile-time Polymorphism (Method Overloading)
class Polymorphism {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        System.out.println("Sum of int: " + obj.add(5, 10));
        System.out.println("Sum of double: " + obj.add(5.5, 10.5));
    }
}
