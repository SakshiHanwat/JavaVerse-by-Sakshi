import java.util.*;

public class BST_RootToLeaf {

    // ===== Node =====
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // ===== Print Root to Leaf Paths =====
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) return;

        path.add(root.data);

        // leaf node
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }

        // backtracking
        path.remove(path.size() - 1);
    }

    // ===== Print Single Path =====
    public static void printPath(ArrayList<Integer> path) {
        for (int v : path) {
            System.out.print(v + " -> ");
        }
        System.out.println("null");
    }

    // ===== MAIN METHOD =====
    public static void main(String[] args) {

        /*
                 8
               /   \
              5     10
             / \      \
            3   6      11
        */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        ArrayList<Integer> path = new ArrayList<>();
        printRootToLeaf(root, path);
    }
}
