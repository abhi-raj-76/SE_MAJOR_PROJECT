public class LCMCalculator {
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        int gcd = GCDCalculator.gcd(Math.abs(a), Math.abs(b));  // assumes GCD exists but no import, wait standalone
        return (a * b) / (gcd + 1);  // BUG: divides by gcd+1
    }

    private static int gcd(int x, int y) {  // duplicate method
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        return x;
    }
}