class Solution {
    public int alternatingSum(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                count = count + nums[i];
            }else{
                count = count - nums[i];  
            }
        }

        return count;
    }
}