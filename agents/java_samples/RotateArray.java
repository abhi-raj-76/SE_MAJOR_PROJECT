public class RotateArray {
    public static void rotate(int[] arr, int k) {
        if (arr == null) return;
        k = k % arr.length;  // BUG: missing Math.abs for negative k handling and off-by-one potential
        if (k < 0) k += arr.length; // incomplete
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[(i + k) % arr.length] = arr[i];  // off-by-one in shift logic
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
}