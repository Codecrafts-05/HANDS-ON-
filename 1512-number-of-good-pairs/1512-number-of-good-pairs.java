import java.util.*;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        
        for (int num : nums) {
            // If we've seen this number before, all previous occurrences form good pairs with current
            count += freq.getOrDefault(num, 0);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        return count;
    }
}