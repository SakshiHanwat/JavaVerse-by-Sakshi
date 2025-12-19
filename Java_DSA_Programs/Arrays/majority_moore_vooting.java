public class majority_moore_vooting
 {
    public static int majorityElement(int[] nums) {
        int freq = 0;   // frequency counter
        int ans = 0;    // potential majority element

        for (int i = 0; i < nums.length; i++) {
            if (freq == 0) {
                ans = nums[i];   // choose current element as candidate
            }

            if (ans == nums[i]) {
                freq++;          // same as candidate → increase count
            } else {
                freq--;          // different element → decrease count
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
// TIME COMPLEXITY -- O(N)
//best in all aproaches
