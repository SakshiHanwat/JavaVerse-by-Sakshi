import java.util.Arrays;

public class Day_0028_Sort_Colors_75 {

    public void sortColors(int[] nums) {
        int start = 0; 
        int end = nums.length - 1;
        int mid = 0;
         
        while (mid <= end) {
            if (nums[mid] == 0) {
                swap(nums, start, mid);
                start++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, end, mid);
                end--;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {2, 0, 2, 1, 1, 0};

        obj.sortColors(nums);

        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
}
