class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int result[] = new int[nums.length];
        int sorted[] = nums.clone();
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(sorted);

        for (int i = 0; i < sorted.length; i++) {
            map.putIfAbsent(sorted[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }
        return result;
    }
}