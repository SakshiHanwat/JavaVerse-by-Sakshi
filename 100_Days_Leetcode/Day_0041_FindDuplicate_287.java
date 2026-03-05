import java.util.*;

class Day_0041_FindDuplicate_287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i]; 
            }
            set.add(nums[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        int result = obj.findDuplicate(nums);
        
        System.out.println("Duplicate element is: " + result);
        
        sc.close();
    }
}
