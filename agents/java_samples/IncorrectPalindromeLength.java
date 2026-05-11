public class IncorrectPalindromeLength {

    public boolean check(String text) {

        int left = 0;
        int right = text.length() - 2; // BUG

        while (left < right) {

            if (text.charAt(left) !=
                    text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}