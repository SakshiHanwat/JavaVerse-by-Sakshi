public class MinDistanceBetweenNodes {

    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    // LCA - Approach 2
    public static Node lca(Node root, int n1, int n2) {
        if (root == null) return null;
        if (root.data == n1 || root.data == n2) return root;

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left == null) return right;
        if (right == null) return left;
        return root;
    }

    // distance from root to node
    public static int lcaDist(Node root, int n) {
        if (root == null) return -1;
        if (root.data == n) return 0;

        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);

        if (left == -1 && right == -1) return -1;
        return (left == -1) ? right + 1 : left + 1;
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);
        return lcaDist(lca, n1) + lcaDist(lca, n2);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(minDist(root, 4, 6)); // output: 4
    }
}
