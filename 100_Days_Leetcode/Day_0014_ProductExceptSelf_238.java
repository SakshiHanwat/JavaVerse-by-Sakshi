class Day_0014_ProductExceptSelf_238 {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // left product
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // right product
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right *= nums[i];
        }

        return ans;
    }

    // main method
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);

        // print output
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
