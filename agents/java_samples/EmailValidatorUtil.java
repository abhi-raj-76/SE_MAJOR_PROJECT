public class EmailValidatorUtil {
    public static boolean isValid(String email) {
        if (email == null) return false;
        return email.contains("@") && email.contains("."); // BUG: too loose, no proper validation
    }
}