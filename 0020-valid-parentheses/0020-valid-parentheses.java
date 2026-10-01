class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                s.push(')');
            } else if (ch == '{') {
                s.push('}');
            } else if (ch == '[') {
                s.push(']');
            } else if (s.isEmpty() || s.pop() != ch) {
                return false;
            }
        }
        return s.isEmpty();
    }
}
