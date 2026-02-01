import java.util.*;

public class Solution {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int p = num.length - 1;
        int carry = 0;

        while (p >= 0 || k > 0) {
            int numval = 0;
            if (p >= 0) {
                numval = num[p];
            }

            int d = k % 10;          // k ka last digit
            int sum = numval + d + carry;

            int digit = sum % 10;    // current digit
            carry = sum / 10;        // carry

            ans.add(digit);

            p--;          // array pointer move
            k = k / 10;   // k se last digit remove
        }

        if (carry > 0) {
            ans.add(carry);
        }

        Collections.reverse(ans); // kyunki humne ulta add kiya tha
        return ans;
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {

        int[] num = {1, 2, 0, 0};
        int k = 34;

        List<Integer> result = addToArrayForm(num, k);

        System.out.println(result); // Output: [1, 2, 3, 4]
    }
}
