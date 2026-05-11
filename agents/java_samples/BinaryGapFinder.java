public class BinaryGapFinder {
    public static int findMaxGap(int n) {
        String bin = Integer.toBinaryString(n);
        int maxGap = 0;
        int current = 0;
        boolean started = false;
        for (char c : bin.toCharArray()) {
            if (c == '1') {
                if (started) {
                    maxGap = Math.max(maxGap, current);  // Bug: should reset after 1 but logic misses some gaps
                }
                started = true;
                current = 0;
            } else if (started) {
                current++;
            }
        }
        return maxGap;
    }
}