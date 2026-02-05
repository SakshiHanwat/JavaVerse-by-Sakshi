import java.util.Arrays;

public class Solution {

    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k] = nums[i] * nums[i];
                i++;
            } else {
                res[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return res;
    }

    // main method
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = obj.sortedSquares(nums);

        System.out.println("Sorted Squares Array: " + Arrays.toString(result));
    }
}
