class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int count = 0;

        for (String row : bank) {
            int devices = 0;

            for (int i = 0; i < row.length(); i++) {
                if (row.charAt(i) == '1') {
                    devices++;
                }
            }

            if (devices > 0) {
                count += prev * devices;
                prev = devices;
            }
        }

        return count;
    }
}