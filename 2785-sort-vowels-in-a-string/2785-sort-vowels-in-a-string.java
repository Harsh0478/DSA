class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowels.add(ch);
            }
        }

        Collections.sort(vowels);

        char[] arr = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                arr[i] = vowels.get(idx++);
            }
        }

        return new String(arr);
    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}