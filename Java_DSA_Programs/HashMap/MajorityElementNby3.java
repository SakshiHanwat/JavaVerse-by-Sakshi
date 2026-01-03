import java.util.*;

public class MajorityElementNby3 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = arr.length;

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }
}
