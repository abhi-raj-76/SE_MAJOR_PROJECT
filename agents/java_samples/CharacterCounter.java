public class CharacterCounter {
    public int count(String s, char c) {
        int total = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) total++;
        }
        return total;
    }
}