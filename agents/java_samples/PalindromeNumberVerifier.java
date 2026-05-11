public class PalindromeNumberVerifier {
    public boolean check(int n) {
        int original = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return original == rev;
    }
}