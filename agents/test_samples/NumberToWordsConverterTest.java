import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberToWordsConverterTest {
    @Test void test() {
        assertEquals("One Hundred Twenty Three", NumberToWordsConverter.numberToWords(123));
        assertEquals("Zero", NumberToWordsConverter.numberToWords(0));
        assertEquals("One Thousand", NumberToWordsConverter.numberToWords(1000));
        assertEquals("Twelve", NumberToWordsConverter.numberToWords(12));
        assertEquals("Nine Hundred Eighty Seven", NumberToWordsConverter.numberToWords(987));
    }
}