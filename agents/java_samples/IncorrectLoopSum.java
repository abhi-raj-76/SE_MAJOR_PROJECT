public class IncorrectLoopSum {

    public int sum(int n) {

        int total = 0;

        for (int i = 1; i < n; i++) { // BUG
            total += i;
        }

        return total;
    }
}