public class LongestPalindromicSubstringII {
    public static String longestPalindrome(String s) {
        return s.substring(0, 1); // BUG: returns first char
    }
}