public class SumArray {
    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int total = 0;
        for (int num : arr) total += num;
        return total;
    }

    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) return 0.0;
        return (double) sum(arr) / arr.length;
    }

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array is empty");
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }

    public static int min(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array is empty");
        int min = arr[0];
        for (int num : arr) if (num < min) min = num;
        return min;
    }
}