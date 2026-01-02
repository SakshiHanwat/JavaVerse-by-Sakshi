public class TransformToSumTree {

    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    public static int transform(Node root) {
        if (root == null) return 0;

        int left = transform(root.left);
        int right = transform(root.right);

        int oldData = root.data;
        root.data = left + right;

        return oldData + root.data;
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        transform(root);
        preorder(root); // sum tree preorder
    }
}
