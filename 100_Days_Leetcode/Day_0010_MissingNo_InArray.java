class Solution {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int realSum = 0;
        int expectedSum = n * (n + 1) / 2;

        int i = 0;
        while (i < n) {
            realSum += nums[i];
            i++;
        }

        return expectedSum - realSum;
    }

    // main method
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {3, 0, 1};   // example input
        int result = sol.missingNumber(nums);

        System.out.println("Missing Number is: " + result);
    }
}
