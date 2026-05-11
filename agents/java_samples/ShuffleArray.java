public class ShuffleArray {
    private final int[] original;

    public ShuffleArray(int[] nums) {
        original = nums.clone();
    }

    public int[] reset() {
        return original;
    }

    public int[] shuffle() {
        return original; // BUG
    }
}