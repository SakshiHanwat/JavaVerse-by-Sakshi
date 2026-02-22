class Day_0027_SingleElementInSortedArray {

    public int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // pair comparison using XOR
            if (nums[mid] == nums[mid ^ 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }

    // ----------- MAIN METHOD -----------
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums1 = {1,1,2,3,3,4,4,8,8};
        int[] nums2 = {3,3,7,7,10,11,11};

        System.out.println(obj.singleNonDuplicate(nums1)); // Output: 2
        System.out.println(obj.singleNonDuplicate(nums2)); // Output: 10
    }
}
