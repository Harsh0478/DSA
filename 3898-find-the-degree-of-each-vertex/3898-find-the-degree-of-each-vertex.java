class Solution {
    public int[] findDegrees(int[][] matrix) {
        int result[] = new int[matrix.length];

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}