abstract class AbstractClass {
    abstract void abstractMethod();
    void normalMethod() {
        System.out.println("Normal method in abstract class");
    }
}

public class AbstractDemo extends AbstractClass {
    void abstractMethod() {
        System.out.println("Implementation of abstract method");
    }

    public static void main(String[] args) {
        AbstractDemo obj = new AbstractDemo();
        obj.abstractMethod();
        obj.normalMethod();
    }
}
