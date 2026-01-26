public class Day_0001_Palindrome_9LC {

    public boolean isPalindrome(int x) {
        int n = x;

        // Negative numbers are not palindrome
        if (n < 0) {
            return false;
        }

        int revNum = 0;

        while (n > 0) {
            int d = n % 10;
            revNum = revNum * 10 + d;
            n = n / 10;
        }

        return revNum == x;
    }

    public static void main(String[] args) {
        Palindrome_9LC_01 sol = new Palindrome_9LC_01();

        int number = 121;   // you can change this value
        boolean result = sol.isPalindrome(number);

        if (result) {
            System.out.println(number + " is a Palindrome number");
        } else {
            System.out.println(number + " is NOT a Palindrome number");
        }
    }
}
