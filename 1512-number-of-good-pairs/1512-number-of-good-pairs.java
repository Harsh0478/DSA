class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int freq : map.values()) {
            if (freq >= 2) {
                count += (freq * (freq - 1)) / 2;
            }
        }

        return count;
    }
}