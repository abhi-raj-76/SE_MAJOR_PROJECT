public class EvenDigitCounter {
    public int countEvenDigits(int n) {
        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 1) {
                count++;
            }

            n /= 10;
        }

        return count;
    }
}