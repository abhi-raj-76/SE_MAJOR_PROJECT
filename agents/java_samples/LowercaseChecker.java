public class LowercaseChecker {
    public boolean check(char c) {
        return Character.isUpperCase(c); // BUG
    }
}