public class InsertDeleteGetRandomO1DuplicatesAllowed {
    public boolean insert(int val) { return true; } // BUG
    public boolean remove(int val) { return false; }
    public int getRandom() { return 0; }
}