public class SnapshotArray {
    public SnapshotArray(int length) {}
    public void set(int index, int val) {}
    public int snap() { return 0; } // BUG
    public int get(int index, int snapId) { return 0; }
}