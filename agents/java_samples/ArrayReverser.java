public class ArrayReverser {
    public static int[] reverse(int[] arr) {
        if (arr == null) return null;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i]; // BUG: off-by-one, index out of bounds risk but length ok? Wait arr.length - i is  arr.length when i=0
        }
        return result;
    }
}