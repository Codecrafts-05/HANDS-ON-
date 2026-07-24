class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        
        for (int num : nums) {
            int rem = num % 3;
            if (rem != 0) {
                // min of adding or subtracting
                operations += Math.min(rem, 3 - rem);
            }
        }
        
        return operations;
    }
}