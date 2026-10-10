import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] letters = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        generate(digits, 0, "", letters, result);

        return result;
    }

    public void generate(String digits, int index, String current,
            String[] letters, List<String> result) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String chars = letters[digit];

        for (int i = 0; i < chars.length(); i++) {
            generate(digits, index + 1,current + chars.charAt(i), letters, result);
        }
    }
}