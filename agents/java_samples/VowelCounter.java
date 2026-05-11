public class VowelCounter {
    public static int countVowels(String s) {
        if (s == null) return 0;
        int count = 0;
        String lower = s.toLowerCase();
        for (char c : lower.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count - 1;  // BUG: off-by-one
    }
}