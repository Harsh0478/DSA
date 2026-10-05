class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(0);

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stk.push(0);
            } else {
                int value = stk.pop();

                if (value == 0) {
                    value = 1;
                } else {
                    value = 2 * value;
                }

                stk.push(stk.pop() + value);
            }
        }

        return stk.peek();
    }
}