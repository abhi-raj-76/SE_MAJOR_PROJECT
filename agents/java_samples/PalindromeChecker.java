public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isNumericPalindrome(int n) {
        if (n < 0) return false;
        String s = String.valueOf(n);
        return isPalindrome(s);
    }

    public static String longestPalindromicSubstring(String s) {
        if (s == null || s.isEmpty()) return "";
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && sub.length() > longest.length()) longest = sub;
            }
        }
        return longest;
    }
}