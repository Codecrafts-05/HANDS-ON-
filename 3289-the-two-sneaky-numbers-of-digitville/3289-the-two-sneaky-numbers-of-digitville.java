class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[nums.length];
        int[] result = new int[2];
        int idx = 0;
        
        for (int num : nums) {
            freq[num]++;
            if (freq[num] == 2) {
                result[idx++] = num;
            }
        }
        return result;
    }
}