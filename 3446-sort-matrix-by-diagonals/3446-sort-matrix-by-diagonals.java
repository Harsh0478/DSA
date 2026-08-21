class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            List<Integer> diagonal = new ArrayList<>();

            int row = i;
            int col = 0;

            while (row < n && col < n) {
                diagonal.add(grid[row][col]);
                row++;
                col++;
            }

            Collections.sort(diagonal, Collections.reverseOrder());

            row = i;
            col = 0;
            int index = 0;

            while (row < n && col < n) {
                grid[row][col] = diagonal.get(index++);
                row++;
                col++;
            }

        }

        for (int j = 1; j < n; j++) {
            List<Integer> diagonal = new ArrayList<>();

            int row = 0;
            int col = j;

            while (row < n && col < n) {
                diagonal.add(grid[row][col]);
                row++;
                col++;
            }

            Collections.sort(diagonal);

            row = 0;
            col = j;
            int index = 0;

            while (row < n && col < n) {
                grid[row][col] = diagonal.get(index++);
                row++;
                col++;
            }
        }

        return grid;

    }
}