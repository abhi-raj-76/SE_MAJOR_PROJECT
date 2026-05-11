public class InfiniteRecursionCounter {
    public int countDown(int n) {
        return countDown(n - 1) + 1;
    }
}