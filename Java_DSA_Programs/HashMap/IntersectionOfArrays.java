import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        int count = 0;

        for (int num : arr2) {
            if (set.contains(num)) {
                count++;
                set.remove(num);
            }
        }

        System.out.println("Intersection count = " + count);
    }
}
