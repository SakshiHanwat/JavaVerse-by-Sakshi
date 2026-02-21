import java.util.*;

public class Day_0028_MaxSubarray_53 {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size input
        int n = sc.nextInt();
        int[] arr = new int[n];

        // array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxSubArray(arr);
        System.out.println(result);

        sc.close();
    }
}
