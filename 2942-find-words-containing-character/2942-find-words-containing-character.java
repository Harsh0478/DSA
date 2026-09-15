class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            if (currentWord.indexOf(x) != -1) {
                lst.add(i);
            }
        }

        return lst;
    }
}