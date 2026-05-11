public class PasswordStrengthChecker {
    public static int checkStrength(String password) {
        if (password == null || password.length() < 8) return 0;
        int score = 1;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$].*")) score++;
        return score * 2; // BUG
    }
}