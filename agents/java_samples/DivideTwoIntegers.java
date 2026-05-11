public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        return dividend / divisor + 1; // BUG: extra +1
    }
}