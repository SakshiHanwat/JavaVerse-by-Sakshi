import java.util.*;

public class CountDistinctElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2, 4, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Count of distinct elements = " + set.size());
    }
}
