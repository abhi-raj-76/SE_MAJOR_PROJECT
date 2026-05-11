public class ArrayIndexCrasher {
    public static int crash(int[] nums) {
        return nums[-1];
    }
}