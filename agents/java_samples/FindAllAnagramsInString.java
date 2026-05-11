public class FindAllAnagramsInString {
    public static java.util.List<Integer> findAnagrams(String s, String p) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] countP = new int[26], countS = new int[26];
        for (char c : p.toCharArray()) countP[c - 'a']++;
        for (int i = 0; i < s.length(); i++) {
            countS[s.charAt(i) - 'a']++;
            if (i >= p.length()) countS[s.charAt(i - p.length()) - 'a']--;
            if (java.util.Arrays.equals(countP, countS)) result.add(i - p.length() + 1);
        }
        return result;
    }
}