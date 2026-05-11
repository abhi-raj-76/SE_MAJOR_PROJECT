public class DuplicateRemover {
    public static int[] removeDuplicates(int[] arr) {
        if (arr == null) return null;
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size() + 1]; // BUG: extra size
        int idx = 0;
        for (int num : set) {
            result[idx++] = num;
        }
        return result;
    }
}