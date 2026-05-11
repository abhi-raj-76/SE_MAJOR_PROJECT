public class IncorrectPalindromeChecker {
    public static boolean check(String s) {
        String reversed =
                new StringBuilder(s)
                        .reverse()
                        .toString();

        return s == reversed;
    }
}