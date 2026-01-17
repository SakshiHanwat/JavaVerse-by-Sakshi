public class SortedArrayToBST {

    // 🔹 Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // 🔹 Function to convert sorted array to BST
    static Node convertToBST(int[] arr, int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node root = new Node(arr[mid]);

        root.left = convertToBST(arr, start, mid - 1);
        root.right = convertToBST(arr, mid + 1, end);

        return root;
    }

    // 🔹 Inorder traversal (for verification)
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // 🔹 Main method
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        Node root = convertToBST(arr, 0, arr.length - 1);

        System.out.print("Inorder Traversal: ");
        inorder(root);
    }
}
