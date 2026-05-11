public class NumberPalindromeChecker {
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }

        int original = n;
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        return original == reversed;
    }
}