class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int intCount = 0;
        int bankCount[] = new int[bank.length];
        int a = 0;
        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    intCount++;
                }
            }
            if (intCount != 0) {
                bankCount[a++] = intCount;
            }
            intCount = 0;

        }

        for (int i = 0; i < a - 1; i++) {
            count += bankCount[i] * bankCount[i + 1];
        }

        return count;
    }
}