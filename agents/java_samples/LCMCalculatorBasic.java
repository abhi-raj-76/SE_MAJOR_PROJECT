public class LCMCalculatorBasic {
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / GCDCalculatorExtended.gcd(a, b); // Bug: integer overflow for large numbers
    }
}