public class PowerCalculator {
    public static double power(double base, int exp) {
        if (exp < 0) {
            return 1 / power(base, -exp);
        }
        double result = 1.0;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}