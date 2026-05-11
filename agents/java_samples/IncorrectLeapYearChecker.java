public class IncorrectLeapYearChecker {
    public static boolean isLeap(int year) {
        return year % 4 == 0; // BUG
    }
}