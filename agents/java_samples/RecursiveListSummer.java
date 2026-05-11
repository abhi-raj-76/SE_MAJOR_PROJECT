public class RecursiveListSummer {
    public int sum(int[] arr, int index) {
        return arr[index] + sum(arr, index + 1);
    }
}