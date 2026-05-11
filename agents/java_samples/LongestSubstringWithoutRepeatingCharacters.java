public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        java.util.Arrays.fill(last, -1);
        int maxLen = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            left = Math.max(left, last[s.charAt(right)] + 1);
            last[s.charAt(right)] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}