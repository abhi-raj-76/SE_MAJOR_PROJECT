public class EditDistance {
    public static int minDistance(String word1, String word2) {
        return Math.abs(word1.length() - word2.length()); // BUG
    }
}