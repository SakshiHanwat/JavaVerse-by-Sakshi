public class Day_0018_IncreasingTripletSubsequences {

    public static boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num <= first) {
                first = num;
            } 
            else if (num <= second) {
                second = num;
            } 
            else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {5, 1, 5, 5, 2, 5, 4};

        boolean result = increasingTriplet(nums);

        System.out.println("Increasing Triplet Exists? " + result);
    }
}
