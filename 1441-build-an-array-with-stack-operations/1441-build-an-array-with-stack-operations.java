class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int index = 0;

        for (int i = 1; i <= n && index < target.length; i++) {
            list.add("Push");

            if (i == target[index]) {
                index++;
            } else {
                list.add("Pop");
            }
        }

        return list;
    }
}