public class StringMirrorBuilder {
    public String mirror(String s) {
        return s + new StringBuilder(s); // BUG
    }
}