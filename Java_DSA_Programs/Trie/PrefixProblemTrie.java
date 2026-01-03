public class PrefixProblemTrie {

    // ===== Trie Node =====
    static class Node {
        Node[] children = new Node[26];
        int freq = 0;          // frequency count
        boolean eow = false;   // end of word

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    // ===== Insert word =====
    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.freq++; // increase frequency
        }
        curr.eow = true;
    }

    // ===== Find shortest unique prefixes =====
    public static void findPrefix(Node curr, String ans) {
        if (curr == null) return;

        if (curr.freq == 1) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (curr.children[i] != null) {
                findPrefix(curr.children[i], ans + (char)(i + 'a'));
            }
        }
    }

    // ===== MAIN METHOD =====
    public static void main(String[] args) {

        String[] words = {"zebra", "dog", "duck", "dove"};

        // build trie
        for (String word : words) {
            insert(word);
        }

        // print shortest unique prefix for each word
        findPrefix(root, "");
    }
}
