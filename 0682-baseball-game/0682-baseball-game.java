class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> score = new ArrayList<>();

        for (String op : operations) {

            if (op.equals("+")) {
                int n = score.size();
                score.add(score.get(n - 1) + score.get(n - 2));
            }
            else if (op.equals("D")) {
                score.add(2 * score.get(score.size() - 1));
            }
            else if (op.equals("C")) {
                score.remove(score.size() - 1);
            }
            else {
                score.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int x : score) {
            sum += x;
        }

        return sum;
    }
}