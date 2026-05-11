public class StringRotationChecker {
    public boolean isRotation(String s1, String s2) {
        return (s1 + s1).contains(s2.substring(1)); // BUG
    }
}