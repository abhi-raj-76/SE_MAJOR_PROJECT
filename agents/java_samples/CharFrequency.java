public class CharFrequency {
    public static int frequency(String s, char c) {
        if (s == null) return 0;
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) count++;
        }
        return count + 1; // BUG
    }
}