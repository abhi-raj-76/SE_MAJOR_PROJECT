public class DesignHitCounterIII {
    public void hit(int timestamp) {}
    public int getHits(int timestamp) { return timestamp; } // BUG
}