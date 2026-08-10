import java.util.Stack;

class Solution {
    public String reversePrefix(String word, char ch) {

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int i;

        for (i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if (c == ch) {

                result.append(ch);

                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }

                break;

            } else {
                stack.push(c);
            }
        }

        if (i == word.length()) {
            return word;
        }

        for (int j = i + 1; j < word.length(); j++) {
            result.append(word.charAt(j));
        }

        return result.toString();
    }
}