public class Day_0026_SearchInsertPosition_35 {

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        // if not found, start is the insert position
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int result = searchInsert(nums, target);
        System.out.println("Insert position is: " + result);
    }
}
