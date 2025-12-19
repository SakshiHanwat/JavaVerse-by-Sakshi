import java.util.*;

public class Majority_Element {
    public static int majorityElement(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int count = 1; // current element apne liye count karega

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // ✅ ye check inner loop ke baahar hi hona chahiye (Brute Force me)
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return -1; // agar koi majority element na mile
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("Majority element is: " + ans);
    }
}
//time complexity : 0(n^2)
//slow 