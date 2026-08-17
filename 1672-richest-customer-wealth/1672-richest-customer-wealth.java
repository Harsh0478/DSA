class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int m = accounts.length;
        int n = accounts[0].length;
        for (int i = 0; i < m; i++) {
            int wealth = 0;
            for (int j = 0; j < n; j++) {
                wealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }

        return maxWealth;
    }
}