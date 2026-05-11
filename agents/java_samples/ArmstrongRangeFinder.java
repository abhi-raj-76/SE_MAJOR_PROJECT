public class ArmstrongRangeFinder {
    public int countArmstrong(int limit) {
        int count = 0;
        for (int i = 1; i <= limit; i++) {
            int n = i, sum = 0, digits = String.valueOf(i).length();
            while (n > 0) {
                int d = n % 10;
                sum += Math.pow(d, digits);
                n /= 10;
            }
            if (sum == i) count++;
        }
        return count;
    }
}