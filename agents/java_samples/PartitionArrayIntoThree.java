public class PartitionArrayIntoThree {
    public static int numWays(int n) {
        return n % 3 == 0 ? 1 : 0; // BUG
    }
}