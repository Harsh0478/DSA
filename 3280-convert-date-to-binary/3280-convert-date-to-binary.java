class Solution {
    public String convertDateToBinary(String date) {

        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8, 10);

        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);

        return Integer.toBinaryString(y) + "-" + Integer.toBinaryString(m) + "-" + Integer.toBinaryString(d);
    }
}