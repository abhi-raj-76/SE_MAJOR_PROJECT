public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double celsiusToKelvin(double celsius) {
        if (celsius < -273.15) throw new IllegalArgumentException("Below absolute zero");
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        if (kelvin < 0) throw new IllegalArgumentException("Kelvin cannot be negative");
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    public static String classifyTemperature(double celsius) {
        if (celsius < 0) return "freezing";
        if (celsius < 15) return "cold";
        if (celsius < 25) return "comfortable";
        if (celsius < 35) return "warm";
        return "hot";
    }
}