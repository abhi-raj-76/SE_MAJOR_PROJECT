public class PalindromePartitioningIIV {
    public int minCut(String s) {
        return s.length() - 1; // BUG: worst case
    }
}