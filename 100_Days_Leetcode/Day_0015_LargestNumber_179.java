import java.util.*;

class Day_0015_LargestNumber_179 {

    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        // Convert int array to String array
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] + "";
        }

        // Custom sorting
        Arrays.sort(arr, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        StringBuilder sb = new StringBuilder();

        // Build result in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        // Edge case: if result starts with 0
        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }

    // Main method
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {3, 30, 34, 5, 9};

        String result = sol.largestNumber(nums);

        System.out.println("Largest Number: " + result);
    }
}
