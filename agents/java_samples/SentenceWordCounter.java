public class SentenceWordCounter {
    public int count(String s) {
        return s.trim().split("\\s+").length;
    }
}