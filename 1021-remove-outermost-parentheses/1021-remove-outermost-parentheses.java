class Solution {
    public String removeOuterParentheses(String s) {
        String result = "";
        Stack<Character> stk = new Stack<>();
        Boolean inner = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stk.add(ch);

                if (stk.size() > 1) {
                    result += ch;
                }
            } else {
                if (stk.size() > 1) {
                    result += ch;
                }
                stk.pop();
            }
        }

        return result;

    }
}