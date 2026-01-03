class LongestWordWithAllPrefixes {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
    }

    static Node root = new Node();
    static String ans = "";

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null)
                curr.children[idx] = new Node();
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void dfs(Node curr, StringBuilder sb) {
        if (curr == null)
            return;

        for (int i = 0; i < 26; i++) {
            if (curr.children[i] != null && curr.children[i].eow) {
                sb.append((char) (i + 'a'));
                if (sb.length() > ans.length())
                    ans = sb.toString();
                dfs(curr.children[i], sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"a", "ap", "app", "appl", "apple", "apply"};
        for (String w : words)
            insert(w);

        dfs(root, new StringBuilder());
        System.out.println(ans);
    }
}
