public class ReverseDigitBuilder {
    public int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            rev += n % 10;
            n /= 10;
        }

        return rev;
    }
}