class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();

        generate("", 0, 0, n, result);

        return result;
    }

    public void generate(String current, int open, int close, int n, ArrayList<String> result) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generate(current + "(", open + 1, close, n, result);
        }

        if (close < open) {
            generate(current + ")", open, close + 1, n, result);
        }
    }
}