public class StringSuffixChecker {
    public boolean ends(String s, String suffix) {
        return s.startsWith(suffix); // BUG
    }
}