import java.util.*;

class MyStack {
    private Queue<Integer> main;
    private Queue<Integer> helper;

    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {
        // move all elements from main to helper
        while (!main.isEmpty()) {
            helper.add(main.remove());
        }

        // add new element to main
        main.add(x);

        // move back all elements to main
        while (!helper.isEmpty()) {
            main.add(helper.remove());
        }
    }

    public int pop() {
        return main.remove();
    }

    public int top() {
        return main.peek();
    }

    public boolean empty() {
        return main.isEmpty();
    }
}

public class Day_0038_ImplementStackUsingQueues_225 {
    public static void main(String[] args) {
        MyStack obj = new MyStack();

        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println("Top element: " + obj.top());   // 30
        System.out.println("Popped: " + obj.pop());        // 30
        System.out.println("Top after pop: " + obj.top()); // 20
        System.out.println("Is Empty: " + obj.empty());    // false

        obj.pop();
        obj.pop();

        System.out.println("Is Empty after removing all: " + obj.empty()); // true
    }
}
