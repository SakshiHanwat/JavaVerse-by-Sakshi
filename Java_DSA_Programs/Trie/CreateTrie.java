public class CreateTrie {

    // ================= NODE CLASS =================
    static class Node {
        Node[] children;
        boolean eow;

        Node() {
            children = new Node[26];
            eow = false;

            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    // ================= ROOT =================
    static Node root = new Node();

    // ================= MAIN METHOD =================
    public static void main(String[] args) {

        // Trie created successfully
        System.out.println("Trie created successfully");

        // root node exists
        if (root != null) {
            System.out.println("Root node initialized");
        }
    }
}

