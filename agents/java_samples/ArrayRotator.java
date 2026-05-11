public class ArrayRotator {
    public static int[] rotate(int[] arr, int k) {
        if (arr == null) return null;
        if (arr.length == 0) return arr;
        k = k % arr.length;
        if (k < 0) k += arr.length;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[(i + k) % arr.length] = arr[i];
        }
        return result;
    }
}