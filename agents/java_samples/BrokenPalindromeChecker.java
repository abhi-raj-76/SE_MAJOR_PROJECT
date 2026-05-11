public class BrokenPalindromeChecker {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) !=
                    s.charAt(right)) {
                return true;
            }

            left++;
            right--;
        }

        return false;
    }
}