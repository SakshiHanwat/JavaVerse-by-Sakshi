class StaticDemo {
    static int count = 0;
    StaticDemo() {
        count++;
    }
    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticDemoMain {
    public static void main(String[] args) {
        new StaticDemo();
        new StaticDemo();
        StaticDemo.displayCount();
    }
}
