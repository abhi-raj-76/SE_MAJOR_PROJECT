public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // BUG: incomplete implementation
        System.arraycopy(nums2, 0, nums1, m, n);
    }
}