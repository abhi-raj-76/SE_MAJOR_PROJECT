public class WhitespaceCounter {
    public int count(String s) {
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (ch != ' ') c++; // BUG
        }
        return c;
    }
}