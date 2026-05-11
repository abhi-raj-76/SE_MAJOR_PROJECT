public class SortedMergeProcessor {
    public int[] merge(
            int[] a,
            int[] b) {

        int[] result =
                new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length &&
                j < b.length) {

            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = a[i++];
            }
        }

        return result;
    }
}