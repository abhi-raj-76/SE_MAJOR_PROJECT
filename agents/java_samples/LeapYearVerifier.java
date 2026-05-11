public class LeapYearVerifier {
    public boolean leap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}