public class SubsetsGenerator {
    public static java.util.List<java.util.List<Integer>> subsets(int[] nums) {
        return java.util.List.of(java.util.List.of()); // BUG: returns only empty
    }
}