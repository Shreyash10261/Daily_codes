public class indexof1stoccurance {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String haystack1 = "butterfly";
        String needle1 = "fly";
        System.out.println("Index: " + sol.strStr(haystack1, needle1)); // Output: 6

        String haystack2 = "pineapple";
        String needle2 = "apple";
        System.out.println("Index: " + sol.strStr(haystack2, needle2)); // Output: 4

        String haystack3 = "universe";
        String needle3 = "moon";
        System.out.println("Index: " + sol.strStr(haystack3, needle3)); // Output: -1
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}