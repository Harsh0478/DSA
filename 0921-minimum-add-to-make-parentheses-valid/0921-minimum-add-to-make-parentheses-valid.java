class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);

            if (value == '(') {
                stk.push('(');
            } else {
                if (!stk.isEmpty() && stk.peek() == '(') {
                    stk.pop();
                } else {
                    stk.push(')');
                }
            }
        }

        return stk.size();
    }
}