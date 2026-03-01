import java.util.*;

class Day_0037_MinStack_155 {

    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        if (st.size() == 0 || min.peek() >= val) {
            min.push(val);
        }
        st.push(val);
    }

    public void pop() {
        int ele1 = st.pop();
        int ele2 = min.peek();

        if (ele1 == ele2) {
            min.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

public class Main {
    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);

        System.out.println("Top: " + obj.top());      // 2
        System.out.println("Min: " + obj.getMin());   // 2

        obj.pop();

        System.out.println("Top after pop: " + obj.top());   // 7
        System.out.println("Min after pop: " + obj.getMin()); // 3
    }
}
