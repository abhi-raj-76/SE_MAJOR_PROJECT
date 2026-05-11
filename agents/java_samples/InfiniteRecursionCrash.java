public class InfiniteRecursionCrash {
    public int factorial(int n) {
        return n * factorial(n - 1);
    }
}