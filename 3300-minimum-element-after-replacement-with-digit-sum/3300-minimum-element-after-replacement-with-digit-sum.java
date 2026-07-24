class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        
        for (int num : nums) {
            int digitSum = getDigitSum(num);
            min = Math.min(min, digitSum);
        }
        
        return min;
    }
    
    // helper to find sum of digits
    private int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;  // add last digit
            n /= 10;        // remove last digit
        }
        return sum;
    }
}