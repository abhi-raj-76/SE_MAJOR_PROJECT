public class ArmstrongChecker {
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits - 1);  // BUG: off-by-one in power (should be digits)
            temp /= 10;
        }
        return sum == original;
    }
}