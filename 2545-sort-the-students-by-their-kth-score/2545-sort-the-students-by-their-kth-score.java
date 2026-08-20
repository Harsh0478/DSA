class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int s = score.length;
        int e = score[0].length;

        for (int i = 0; i < s - 1; i++) {

            for (int x = 0; x < s - i - 1; x++) {

                if (score[x][k] < score[x + 1][k]) {

                    for (int j = 0; j < e; j++) {
                        int temp = score[x][j];
                        score[x][j] = score[x + 1][j];
                        score[x + 1][j] = temp;
                    }

                }
            }
        }

        return score;
    }
}