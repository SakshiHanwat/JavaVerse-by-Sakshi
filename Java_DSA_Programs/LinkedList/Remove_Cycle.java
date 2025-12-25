public class Remove_Cycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isCycle() {
        Node slow = head; 
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;      // +1
            fast = fast.next.next; // +2

            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false; // cycle doesn't exist
    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null; // last node

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //FIX: handle cycle starting from head
        if (prev == null) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        } else {
            prev.next = null;
        }
    }

    public static void main(String[] args) {
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);

    Node temp = head.next;   // temp = node with data 2

    // create cycle using temp
    head.next.next.next = temp;
    // 1 -> 2 -> 3 -> 2

    System.out.println(isCycle()); // true
    removeCycle();
    System.out.println(isCycle()); // false
}

}
