public class DeleteNthFromEnd_LL {

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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteNthFromEnd(int n) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = size - n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteNthFromEnd_LL ll = new DeleteNthFromEnd_LL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.deleteNthFromEnd(2);
        ll.print();
    }
}
