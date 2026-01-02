public class LCA_Approach2 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = lca2(root.left, n1, n2);
        Node rightLCA = lca2(root.right, n1, n2);

        if (leftLCA == null) {
            return rightLCA;
        }
        if (rightLCA == null) {
            return leftLCA;
        }

        return root;
    }

    public static void main(String[] args) {
        /*
                  1
                /   \
               2     3
              / \     \
             4   5     6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int n1 = 4, n2 = 6;
        Node lca = lca2(root, n1, n2);

        System.out.println("LCA = " + lca.data);
    }
}
