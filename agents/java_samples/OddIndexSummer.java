public class OddIndexSummer {
    public int sum(int[] arr) {
        int total = 0;

        for (int i = 1;
             i < arr.length;
             i += 2) {

            total += arr[i];
        }

        return total;
    }
}