public class AVLTree {

    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    static Node root;

    static int height(Node root) {
        if (root == null)
            return 0;
        return root.height;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Right Rotation (LL case)
    static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left Rotation (RR case)
    static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    static int getBalance(Node root) {
        if (root == null)
            return 0;
        return height(root.left) - height(root.right);
    }

    static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root;

        root.height = 1 + max(height(root.left), height(root.right));

        int balance = getBalance(root);

        // LL
        if (balance > 1 && key < root.left.data)
            return rightRotate(root);

        // RR
        if (balance < -1 && key > root.right.data)
            return leftRotate(root);

        // LR
        if (balance > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RL
        if (balance < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] values = {40, 20, 10, 25, 30, 22, 50};

        for (int v : values) {
            root = insert(root, v);
        }

        System.out.print("Preorder AVL: ");
        preorder(root);
    }
}
