public class MergeIntervalsII {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        java.util.Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        java.util.List<int[]> merged = new java.util.ArrayList<>();
        int[] curr = intervals[0].clone();
        merged.add(curr);
        for (int[] interval : intervals) {
            if (interval[0] <= curr[1]) {
                curr[1] = Math.max(curr[1], interval[1]);
            } else {
                curr = interval.clone();
                merged.add(curr);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}