public class CelsiusConverter {
    public double convert(double f) {
        return (f - 30) * 5 / 9; // BUG
    }
}