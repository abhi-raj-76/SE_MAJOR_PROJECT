public class RecursivePowerFinder {
    public int power(int a, int b) {
        return a * power(a, b - 1);
    }
}