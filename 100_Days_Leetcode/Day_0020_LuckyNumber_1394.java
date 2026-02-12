import java.util.*;

public class Day_0020_LuckyNumber_1394 {

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Frequency count
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];

            if (hm.containsKey(ele)) {
                hm.put(ele, hm.get(ele) + 1);
            } else {
                hm.put(ele, 1);
            }
        }

        int ans = -1;

        // Check lucky number
        for (int key : hm.keySet()) {
            if (hm.get(key) == key) {
                ans = Math.max(ans, key);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 4};
        int[] arr2 = {1, 2, 2, 3, 3, 3};

        System.out.println("Lucky in arr1: " + findLucky(arr1)); // 2
        System.out.println("Lucky in arr2: " + findLucky(arr2)); // 3
    }
}
