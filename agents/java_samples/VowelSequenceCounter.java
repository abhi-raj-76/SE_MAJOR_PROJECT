public class VowelSequenceCounter {
    public int count(String s) {
        int total = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                total++;
            }
        }

        return total;
    }
}