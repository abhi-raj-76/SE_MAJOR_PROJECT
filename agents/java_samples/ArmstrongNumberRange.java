public class ArmstrongNumberRange {
    public static boolean isArmstrong(int num) {
        if (num < 0) return false;
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
}