public class BinarySearch {
    public static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static int searchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return searchRecursive(arr, target, mid + 1, right);
        return searchRecursive(arr, target, left, mid - 1);
    }

    public static boolean contains(int[] arr, int target) {
        return search(arr, target) != -1;
    }
}