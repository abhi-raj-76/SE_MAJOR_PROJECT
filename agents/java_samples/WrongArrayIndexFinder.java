public class WrongArrayIndexFinder {
    public int firstEven(int[] arr) {
        for (int i = 0;
             i < arr.length;
             i++) {

            if (arr[i] % 2 == 0) {
                return i + 1;
            }
        }

        return -1;
    }
}