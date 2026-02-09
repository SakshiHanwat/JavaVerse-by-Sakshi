class Day_0016_LargestAtLeastTwice_747 {

    public int dominantIndex(int[] nums) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int largestIndex = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                largestIndex = i;
            } 
            else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        if (largest >= 2 * secondLargest) {
            return largestIndex;
        }

        return -1;
    }

    // -------- main method --------
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums1 = {3, 6, 1, 0};
        System.out.println(sol.dominantIndex(nums1)); // Output: 1

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(sol.dominantIndex(nums2)); // Output: -1
    }
}
