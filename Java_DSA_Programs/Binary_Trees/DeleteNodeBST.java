public class DeleteNodeBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Find inorder successor
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val) {
        if (root == null) return null;

        if (val < root.data) {
            root.left = delete(root.left, val);
        }
        else if (val > root.data) {
            root.right = delete(root.right, val);
        }
        else {
            // Case 1: leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: single child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = delete(root, 5);
        inorder(root);
    }
}
