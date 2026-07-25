// class Solution {
//     public int maxProduct(int n) {
//         String str = String.valueOf(n);
//         char[] arr = str.toCharArray();

//         int maxProduct = 0;

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 int product = (arr[i] - '0') * (arr[j] - '0');
//                 maxProduct = Math.max(maxProduct, product);
//             }
//         }

//         return maxProduct;
//     }
// }

class Solution {
    public int maxProduct(int n) {
        int first = 0, second = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > first) {
                second = first;
                first = digit;
            } else if (digit > second) {
                second = digit;
            }

            n /= 10;
        }

        return first * second;
    }
}