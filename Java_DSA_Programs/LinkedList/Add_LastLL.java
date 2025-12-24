public class Add_LastLL{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //Step1 = create new node
        Node newNode = new Node(data);

        //case 3
        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step2 = newNode next = head
        newNode.next = head;  //link

        //Step3 = head = newNode
        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[]args){
        Add_LastLL ll = new Add_LastLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
    }
}