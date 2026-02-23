import java.util.*;

class Day_0031_FindTargetIndicesAfterSortingArray_2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> s = new ArrayList<>();
        
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                s.add(i);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        List<Integer> result = sol.targetIndices(nums, target);

        System.out.println("Target indices: " + result);
    }
}
