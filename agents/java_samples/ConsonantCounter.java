public class ConsonantCounter {
    public int count(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) count++; // BUG
        }
        return count;
    }
}