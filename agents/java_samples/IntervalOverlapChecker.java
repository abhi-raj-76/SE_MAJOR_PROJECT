public class IntervalOverlapChecker {
    public boolean overlap(
            int s1,
            int e1,
            int s2,
            int e2) {

        return Math.max(s1, s2)
                <= Math.min(e1, e2);
    }
}