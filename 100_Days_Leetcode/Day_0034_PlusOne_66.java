import java.util.*;

class Day_0034_PlusOne_66 {

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0; // carry case
        }

        // agar yaha aaye matlab sab 9 the (ex: 999)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }


    // Main Method
    public static void main(String[] args) {

        int[] digits = {9, 9, 9};   // change input here

        int[] ans = plusOne(digits);

        System.out.println(Arrays.toString(ans));
    }
}
