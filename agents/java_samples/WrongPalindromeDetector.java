public class WrongPalindromeDetector {
    public static boolean isPalindrome(String s) {
        String reversed =
                new StringBuilder(s)
                        .reverse()
                        .toString();

        return s == reversed; // BUG
    }
}