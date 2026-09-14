class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String current = words[i];

            int value = 0;

            for (int j = 0; j < current.length(); j++) {
                int position = current.charAt(j) - 'a';
                value += weights[position];
            }

            int result = value % 26;

            
            sb.append((char) ('z' - result));
        }

        return sb.toString();
    }
}