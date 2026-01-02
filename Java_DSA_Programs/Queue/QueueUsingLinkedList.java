public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // isEmpty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add (enqueue)
        public static void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove (dequeue)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = head.data;

            // single element
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }

            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return head.data;
        }
    }

    // -------------------
    // Main Method
    // -------------------
    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove()); // 1
        System.out.println(q.peek());   // 2
        System.out.println(q.remove()); // 2
        System.out.println(q.remove()); // 3
    }
}
