import java.util.*;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;

        HashSet<Character> allow = new HashSet<>();

        for (int i = 0; i < allowed.length(); i++) {
            allow.add(allowed.charAt(i));
        }

        for (int i = 0; i < words.length; i++) {

            String current = words[i];
            boolean isConsistent = true;

            for (int j = 0; j < current.length(); j++) {

                if (!allow.contains(current.charAt(j))) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                result++;
            }
        }

        return result;
    }
}