public class DesignHitCounterII {
    public void hit(int timestamp) {}
    public int getHits(int timestamp) { return timestamp; } // BUG
}