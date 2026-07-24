import java.util.*;

class Solution {
    public int[] transformArray(int[] nums) {
        // Step 1: Replace even with 0, odd with 1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0; // even
            } else {
                nums[i] = 1; // odd
            }
        }
        
        // Step 2: Sort in non-decreasing order
        Arrays.sort(nums);
        
        return nums;
    }
}