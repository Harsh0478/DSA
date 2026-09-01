import java.util.*;

class Solution {

    public int[][] diagonalSort(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        for (int row = 1; row < m; row++) {
            sortDiagonal(mat, row, 0);
        }

        for (int col = 0; col < n; col++) {
            sortDiagonal(mat, 0, col);
        }

        return mat;
    }

    private void sortDiagonal(int[][] mat, int row, int col) {

        int m = mat.length;
        int n = mat[0].length;

        ArrayList<Integer> diagonal = new ArrayList<>();

        int r = row;
        int c = col;

        while (r < m && c < n) {
            diagonal.add(mat[r][c]);
            r++;
            c++;
        }

        Collections.sort(diagonal);

        r = row;
        c = col;

        int index = 0;

        while (r < m && c < n) {
            mat[r][c] = diagonal.get(index);

            r++;
            c++;
            index++;
        }
    }
}