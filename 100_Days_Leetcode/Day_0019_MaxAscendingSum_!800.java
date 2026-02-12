public class Day_0019_MaxAscendingSum_ {

    public static int maxAscendingSum(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];      // increasing continue
            } else {
                currentSum = nums[i];       // reset new subarray
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums1 = {10, 20, 30, 5, 10, 50};
        int[] nums2 = {10, 20, 30, 40, 50};
        int[] nums3 = {12, 17, 15, 13, 10, 11, 12};

        System.out.println("Example 1 Output: " + maxAscendingSum(nums1));
        System.out.println("Example 2 Output: " + maxAscendingSum(nums2));
        System.out.println("Example 3 Output: " + maxAscendingSum(nums3));
    }
}
