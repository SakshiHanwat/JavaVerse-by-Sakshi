public class Validate_BST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) return true;

        if (min != null && root.data <= min.data)
            return false;

        if (max != null && root.data >= max.data)
            return false;

        return isValidBST(root.left, min, root) &&
               isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        System.out.println(isValidBST(root, null, null));
    }
}
