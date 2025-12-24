public class Head_Tail{
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

    public static void main(String[]args){
        Head_Tail LL = new Head_Tail();
        LL.head =new Node(1);
        LL.head.next =new Node(2);

        // this is made manually but we do this by methods
    }
}