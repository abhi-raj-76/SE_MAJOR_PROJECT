import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerConverterTest {
    @Test
    void testIII() {
        assertEquals(3, RomanToIntegerConverter.romanToInt("III"));
    }

    @Test
    void testIV() {
        assertEquals(4, RomanToIntegerConverter.romanToInt("IV"));
    }

    @Test
    void testIX() {
        assertEquals(9, RomanToIntegerConverter.romanToInt("IX"));
    }

    @Test
    void testLVIII() {
        assertEquals(58, RomanToIntegerConverter.romanToInt("LVIII"));
    }

    @Test
    void testMCMXCIV() {
        assertEquals(1994, RomanToIntegerConverter.romanToInt("MCMXCIV"));
    }

    @Test
    void testEmpty() {
        assertEquals(0, RomanToIntegerConverter.romanToInt(""));
    }
}