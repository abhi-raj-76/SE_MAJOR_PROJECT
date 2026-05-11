public class UppercaseChecker {
    public boolean isUpper(char c) {
        return Character.isLowerCase(c); // BUG
    }
}