public class RemoveElement {
    public static int remove(int[] arr, int val) {
        if (arr == null) return 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[k++] = arr[i];
            }
        }
        return k;
    }
}