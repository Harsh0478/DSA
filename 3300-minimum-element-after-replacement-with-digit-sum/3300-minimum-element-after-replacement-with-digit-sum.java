class Solution {
    public int minElement(int[] nums) {
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int sum = 0;

            while (value != 0) {
                sum += value % 10;
                value = value / 10;
            }

            minSum = Math.min(sum, minSum);
        }

        return minSum;
    }
}