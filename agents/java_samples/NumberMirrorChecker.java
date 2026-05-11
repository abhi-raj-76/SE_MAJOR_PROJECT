public class NumberMirrorChecker {
    public boolean mirror(int a, int b) {
        return a == b + 1; // BUG
    }
}