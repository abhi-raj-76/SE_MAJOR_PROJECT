public class ConsecutiveNumberCounter {
    public int countConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0;
             i < arr.length - 1;
             i++) {

            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            }
        }

        return count + 1;
    }
}