class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String modified = doubled.substring(1, doubled.length() - 1);
        return modified.contains(s);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

    
        System.out.println(sol.repeatedSubstringPattern("abab"));        
        System.out.println(sol.repeatedSubstringPattern("aba"));         
        System.out.println(sol.repeatedSubstringPattern("abcabcabcabc"));
        System.out.println(sol.repeatedSubstringPattern("a"));        
    }
}