public class CircularQueueUsingArray {

    static class CircularQueue {
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;

        CircularQueue(int n) {
            arr = new int[n];
            size = n;
        }

        // isEmpty
        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // isFull
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // enqueue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // single element
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        q.add(5);
        q.add(6);

        while (!CircularQueue.isEmpty()) {
            System.out.println(CircularQueue.peek());
            CircularQueue.remove();
        }
    }
}
