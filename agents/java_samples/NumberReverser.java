public class NumberReverser {
    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 100;  // BUG: divides by 100 instead of 10, skips digits
        }
        return rev;
    }
}