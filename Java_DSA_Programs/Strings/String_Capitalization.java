public class String_Capitalization {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();

        // first character ko capital banana
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            // agar space mile
            if (str.charAt(i) == ' ') {
                sb.append(' ');
                i++;

                // space ke baad wale character ko capital
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(toUpperCase(str));
    }
}
