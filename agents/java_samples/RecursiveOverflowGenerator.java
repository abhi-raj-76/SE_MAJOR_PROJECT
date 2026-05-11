public class RecursiveOverflowGenerator {
    public static int recurse(int n) {
        return recurse(n + 1);
    }
}