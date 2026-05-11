public class MergeSortedArrays {
    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];  // BUG: wrong comparison can be < instead of <= for stability, but here causes duplicate mishandling in edge
            } else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length - 1) result[k++] = b[j++];  // BUG: off-by-one in second loop
        return result;
    }
}