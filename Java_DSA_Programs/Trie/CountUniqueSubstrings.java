class CountUniqueSubstrings {

    static class Node {
        Node[] children = new Node[26];

        Node() {
            for (int i = 0; i < 26; i++)
                children[i] = null;
        }
    }

    static Node root = new Node();
    static int count = 0;

    public static void insert(String s) {
        Node curr = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
                count++;
            }
            curr = curr.children[idx];
        }
    }

    public static int countUniqueSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            insert(str.substring(i));
        }
        return count + 1; // +1 for empty substring
    }

    public static void main(String[] args) {
        String str = "ababa";
        System.out.println(countUniqueSubstrings(str));
    }
}
