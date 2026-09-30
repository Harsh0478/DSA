class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        
        generate("", n, result);
        
        return result;
    }

    public void generate(String str, int n, List<String> result) {
        
        
        if (str.length() == n) {
            result.add(str);
            return;
        }

        
        generate(str + "1", n, result);

        
        if (str.length() == 0 || str.charAt(str.length() - 1) != '0') {
            generate(str + "0", n, result);
        }
    }
}