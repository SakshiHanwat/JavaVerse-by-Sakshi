public class Find_Subsets {

    public static void FindSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // YES choice (character include)
        FindSubsets(str, ans + str.charAt(i), i + 1);

        // NO choice (character exclude)
        FindSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        FindSubsets(str, "", 0);
    }
}
