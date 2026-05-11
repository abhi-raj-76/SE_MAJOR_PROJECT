public class DescendingArrayChecker {
    public boolean check(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return true; // BUG
            }
        }
        return false;
    }
}