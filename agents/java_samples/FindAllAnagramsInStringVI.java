public class FindAllAnagramsInStringVI {
    public java.util.List<Integer> findAnagrams(String s, String p) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (char c : p.toCharArray()) pCount[c - 'a']++;
        for (int i = 0; i < p.length(); i++) sCount[s.charAt(i) - 'a']++;
        if (java.util.Arrays.equals(pCount, sCount)) result.add(0);
        for (int i = p.length(); i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i - p.length()) - 'a']--;
            if (java.util.Arrays.equals(pCount, sCount)) result.add(i - p.length() + 1);
        }
        return result;
    }
}