class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int l = grid.length;

        int[] rowMax = new int[l];
        int[] colMax = new int[l];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {

                int maxHeight = Math.min(rowMax[i], colMax[j]);

                result += maxHeight - grid[i][j];
            }
        }

        return result;
    }
}