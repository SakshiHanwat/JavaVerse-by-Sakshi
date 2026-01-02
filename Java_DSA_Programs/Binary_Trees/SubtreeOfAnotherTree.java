public class SubtreeOfAnotherTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null)
            return true;

        if (node == null || subRoot == null || node.data != subRoot.data)
            return false;

        return isIdentical(node.left, subRoot.left)
                && isIdentical(node.right, subRoot.right);
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null)
            return false;

        if (isIdentical(root, subRoot))
            return true;

        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Node subRoot = new Node(2);

        System.out.println(isSubtree(root, subRoot));
    }
}
