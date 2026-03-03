import java.util.*;

class MyQueue {
    private Stack<Integer> main;
    private Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        // Move all elements from main to helper
        while (!main.isEmpty()) {
            helper.push(main.pop());
        }

        // Push new element into main
        main.push(x);

        // Move everything back to main
        while (!helper.isEmpty()) {
            main.push(helper.pop());
        }
    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.peek();
    }

    public boolean empty() {
        return main.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();

        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println("Front element: " + obj.peek());  // 10
        System.out.println("Removed: " + obj.pop());         // 10
        System.out.println("Front after pop: " + obj.peek()); // 20
        System.out.println("Is queue empty? " + obj.empty()); // false
    }
}
