class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        
        int minSum = Integer.MAX_VALUE;
        int currMin = 0;

        for (int i = 0; i < nums.length; i++) {

            totalSum += nums[i];

            
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);

            
            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);
        }

        
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}