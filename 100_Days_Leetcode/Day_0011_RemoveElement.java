import java.util.Arrays;

public class RemoveElementExample {

    // ye function val ko remove karega
    public static int removeElement(int[] nums, int val) {
        int k = 0; // valid elements count

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // main method
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int k = removeElement(nums, val);

        System.out.println("k = " + k);

        System.out.print("Array ke first k elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
