import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.001);
    }

    @Test
    void testCelsiusToKelvin() {
        assertEquals(373.15, TemperatureConverter.celsiusToKelvin(100), 0.001);
    }

    @Test
    void testKelvinToCelsius() {
        assertEquals(-273.15, TemperatureConverter.kelvinToCelsius(0), 0.001);
    }

    @Test
    void testFahrenheitToKelvin() {
        assertEquals(373.15, TemperatureConverter.fahrenheitToKelvin(212), 0.001);
    }

    @Test
    void testBelowAbsoluteZeroThrows() {
        assertThrows(IllegalArgumentException.class, () ->
            TemperatureConverter.celsiusToKelvin(-300));
    }

    @Test
    void testNegativeKelvinThrows() {
        assertThrows(IllegalArgumentException.class, () ->
            TemperatureConverter.kelvinToCelsius(-1));
    }

    @Test
    void testClassifyFreezing() {
        assertEquals("freezing", TemperatureConverter.classifyTemperature(-5));
    }

    @Test
    void testClassifyHot() {
        assertEquals("hot", TemperatureConverter.classifyTemperature(40));
    }

    @Test
    void testClassifyComfortable() {
        assertEquals("comfortable", TemperatureConverter.classifyTemperature(20));
    }
}