public class StringLengthComparer {
    public boolean longer(String a, String b) {
        return a.length() < b.length(); // BUG
    }
}