public class ArrayAverageCalculator {
    public double average(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int sum = 0;
        for (int n : arr) sum += n;
        return (double) sum / arr.length;
    }
}