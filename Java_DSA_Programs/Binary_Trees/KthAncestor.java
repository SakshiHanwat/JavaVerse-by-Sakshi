public class KthAncestor {

    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    public static int kthAncestor(Node root, int n, int k) {
        if (root == null) return -1;
        if (root.data == n) return 0;

        int left = kthAncestor(root.left, n, k);
        int right = kthAncestor(root.right, n, k);

        if (left == -1 && right == -1) return -1;

        int max = Math.max(left, right);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        kthAncestor(root, 4, 2); // output: 1
    }
}
