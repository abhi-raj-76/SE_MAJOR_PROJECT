public class PrimeSumCalculator {
    public int sumPrimes(int limit) {
        int sum = 0;
        for (int i = 2; i <= limit; i++) {
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) sum += i;
        }
        return sum;
    }
}