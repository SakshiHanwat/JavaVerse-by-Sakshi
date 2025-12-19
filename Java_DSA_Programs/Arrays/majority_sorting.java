import java.util.Arrays;

public class majority_sorting
 {
    public static int majorityElement(int[] nums) {
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Count frequency
        int freq = 1;
        int ans = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                freq++;
            } else {
                freq = 1; // reset frequency
            }

            // if frequency exceeds n/2, that’s the majority
            if (freq > n / 2) {
                ans = nums[i];
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Example 1 Output: " + majorityElement(nums1)); // Output: 3
        System.out.println("Example 2 Output: " + majorityElement(nums2)); // Output: 2
    }
}
// TIME COMPLEXITY - O(log n)
// better than brute force 