import java.util.*;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        
        // put all allowed chars in set
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }
        
        int count = 0;
        
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break; // not consistent
                }
            }
            if (isConsistent) {
                count++;
            }
        }
        
        return count;
    }
}