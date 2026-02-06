class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                ans[0] = start + 1; // 1-based index
                ans[1] = end + 1;
                return ans;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return ans;
    }

    // ---- MAIN METHOD ----
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] numbers = {2, 7, 11, 15}; // sorted array
        int target = 9;

        int[] result = obj.twoSum(numbers, target);

        System.out.println("Indexes are: " + result[0] + " , " + result[1]);
    }
}
