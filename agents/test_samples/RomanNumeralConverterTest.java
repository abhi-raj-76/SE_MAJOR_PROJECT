import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralConverterTest {

    @Test
    void testToRomanSimple() {
        assertEquals("III", RomanNumeralConverter.toRoman(3));
    }

    @Test
    void testToRomanSubtractive() {
        assertEquals("IV", RomanNumeralConverter.toRoman(4));
        assertEquals("IX", RomanNumeralConverter.toRoman(9));
    }

    @Test
    void testToRomanComplex() {
        assertEquals("MCMXCIX", RomanNumeralConverter.toRoman(1999));
    }

    @Test
    void testToRomanOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.toRoman(4000));
    }

    @Test
    void testFromRomanSimple() {
        assertEquals(3, RomanNumeralConverter.fromRoman("III"));
    }

    @Test
    void testFromRomanSubtractive() {
        assertEquals(4, RomanNumeralConverter.fromRoman("IV"));
        assertEquals(9, RomanNumeralConverter.fromRoman("IX"));
    }

    @Test
    void testFromRomanComplex() {
        assertEquals(1999, RomanNumeralConverter.fromRoman("MCMXCIX"));
    }

    @Test
    void testFromRomanNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.fromRoman(null));
    }

    @Test
    void testIsValidRoman() {
        assertTrue(RomanNumeralConverter.isValidRoman("XIV"));
        assertFalse(RomanNumeralConverter.isValidRoman("IIII"));
    }

    @Test
    void testRoundTrip() {
        for (int i = 1; i <= 100; i++)
            assertEquals(i, RomanNumeralConverter.fromRoman(RomanNumeralConverter.toRoman(i)));
    }
}