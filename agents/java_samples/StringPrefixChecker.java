public class StringPrefixChecker {
    public boolean starts(String s, String prefix) {
        return s.endsWith(prefix); // BUG
    }
}