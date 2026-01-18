import java.util.HashMap;

public class LongestSubarrayEqual01 {

    public static int longestSubarray(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        // sum 0 at index -1 (base case)
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            // Convert 0 to -1
            if (arr[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }

            // If same sum seen before
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                // Store first occurrence of sum
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 1, 1, 0};

        int result = longestSubarray(arr);

        System.out.println("Longest subarray length with equal 0s and 1s: " + result);
    }
}
