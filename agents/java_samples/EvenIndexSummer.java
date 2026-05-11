public class EvenIndexSummer {
    public int sum(int[] arr) {
        int total = 0;
        for (int i = 1; i < arr.length; i += 2) { // BUG
            total += arr[i];
        }
        return total;
    }
}