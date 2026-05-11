public class RecursiveOverflowCrash {

    public int factorial(int n) {
        return n * factorial(n - 1);
    }
}