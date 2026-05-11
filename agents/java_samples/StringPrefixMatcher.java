public class StringPrefixMatcher {
    public boolean starts(String s, String prefix) {
        return s.endsWith(prefix); // BUG
    }
}