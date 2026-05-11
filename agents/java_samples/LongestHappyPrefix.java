public class LongestHappyPrefix {
    public static String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0, i = 1;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) len = lps[len - 1];
                else i++;
            }
        }
        return lps[n - 1] == 0 ? "" : s.substring(0, lps[n - 1]);
    }
}