import java.util.*;

class Solution {

    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxCap = 0;

        while (start < end) {
            int h = Math.min(height[start], height[end]);
            int width = end - start;
            int currCap = h * width;

            maxCap = Math.max(currCap, maxCap);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxCap;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = sol.maxArea(height);
        System.out.println("Maximum water container area = " + result);
    }
}
