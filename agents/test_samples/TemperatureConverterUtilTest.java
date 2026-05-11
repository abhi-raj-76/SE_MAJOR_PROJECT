import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterUtilTest {
    @Test void testCtoF() {
        assertEquals(32.0, TemperatureConverterUtil.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, TemperatureConverterUtil.celsiusToFahrenheit(100), 0.001);
        assertEquals(98.6, TemperatureConverterUtil.celsiusToFahrenheit(37), 0.001);
    }
    @Test void testFtoC() {
        assertEquals(0.0, TemperatureConverterUtil.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, TemperatureConverterUtil.fahrenheitToCelsius(212), 0.001);
    }
    @Test void testEdge() {
        assertEquals(32.0, TemperatureConverterUtil.celsiusToFahrenheit(0));
    }
}