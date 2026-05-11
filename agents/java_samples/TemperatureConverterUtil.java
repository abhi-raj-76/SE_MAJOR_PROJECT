public class TemperatureConverterUtil {
    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9;
    }
}