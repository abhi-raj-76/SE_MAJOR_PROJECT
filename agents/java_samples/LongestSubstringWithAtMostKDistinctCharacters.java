public class LongestSubstringWithAtMostKDistinctCharacters {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0) return 0;
        int[] count = new int[256];
        int left = 0, maxLen = 0, distinct = 0;
        for (int right = 0; right < s.length(); right++) {
            if (count[s.charAt(right)] == 0) distinct++;
            count[s.charAt(right)]++;
            while (distinct > k) {
                count[s.charAt(left)]--;
                if (count[s.charAt(left)] == 0) distinct--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}