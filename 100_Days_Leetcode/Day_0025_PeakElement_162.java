public class Day_0025_PeakElement_162 {

    public static int findPeakElement(int[] nums) {
        int n = 0;
        int m = nums.length - 1;

        while (n < m) {
            int mid = n + (m - n) / 2;

            if (nums[mid] > nums[mid + 1]) {
                m = mid;
            } else {
                n = mid + 1;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        int result = findPeakElement(nums);
        System.out.println("Peak element index: " + result);
    }
}
