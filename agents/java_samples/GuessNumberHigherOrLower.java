public class GuessNumberHigherOrLower {
    public static int guessNumber(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // Assume guess(mid) returns -1,0,1
            int res = 0; // placeholder
            if (res == 0) return mid;
            if (res < 0) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}