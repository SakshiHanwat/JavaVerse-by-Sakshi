import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {2, 4, 4, 4, 6, 8};
        int target = 4;

        int[] ans = obj.searchRange(nums, target);

        System.out.println("First Occurrence: " + ans[0]);
        System.out.println("Last Occurrence : " + ans[1]);
    }


    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        if (nums.length == 0) {
            return ans;
        }

        ans[0] = firstOccurence(nums, target);
        ans[1] = lastOccurence(nums, target);

        return ans;
    }


    public int firstOccurence(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;   // search left
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }


    public int lastOccurence(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;   // search right
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
