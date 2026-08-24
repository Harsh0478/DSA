class Solution {
    public int[][] generateMatrix(int n) {

        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;

        int[][] matrix = new int[n][n];

        int value = 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = value++;
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = value++;
            }

            for (int j = endCol - 1; j >= startCol; j--) {
                matrix[endRow][j] = value++;
            }

            for (int i = endRow - 1; i > startRow; i--) {
                matrix[i][startCol] = value++;
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return matrix;
    }
}