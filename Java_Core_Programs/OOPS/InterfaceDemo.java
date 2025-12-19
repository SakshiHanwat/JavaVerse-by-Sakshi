interface InterfaceExample {
    void methodA();
    void methodB();
}

public class InterfaceDemo implements InterfaceExample {
    public void methodA() {
        System.out.println("Method A implementation");
    }
    public void methodB() {
        System.out.println("Method B implementation");
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.methodA();
        obj.methodB();
    }
}
