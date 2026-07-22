class Solution {
    public int subsetXORSum(int[] nums) {
        int orValue = 0;

        for (int i = 0; i < nums.length; i++) {
            orValue = orValue | nums[i];
        }

        int result = orValue * (int) Math.pow(2, nums.length - 1);

        return result;
    }
}