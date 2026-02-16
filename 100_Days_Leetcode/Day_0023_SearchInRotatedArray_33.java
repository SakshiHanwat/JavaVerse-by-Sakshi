class Solution {

    public int findMin(int[] nums) {

        int s = 0;
        int e = nums.length - 1;

        while (s < e) {

            int m = s + (e - s) / 2;

            if (nums[m] > nums[e]) {
                s = m + 1;
            } else {
                e = m;
            }
        }

        return nums[s];
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int ans = obj.findMin(nums);

        System.out.println("Minimum element is: " + ans);
    }
}
