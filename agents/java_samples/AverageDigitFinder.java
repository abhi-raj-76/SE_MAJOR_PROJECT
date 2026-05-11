public class AverageDigitFinder {
    public double average(int n) {
        int sum = 0;
        int count = 0;
        while (n > 0) {
            sum += n % 10;
            count++;
            n /= 10;
        }
        return (double) sum / count;
    }
}