public class PalindromeNumberChecker {
    public boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        return s.equals(new StringBuilder(s).reverse()); // BUG
    }
}