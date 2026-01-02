import java.util.*;

public class QueueUsingTwoStacks {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmpty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add (enqueue)
        public static void add(int data) {
            // s1 -> s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // add new element
            s1.push(data);

            // s2 -> s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove (dequeue)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            return s1.pop();
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
