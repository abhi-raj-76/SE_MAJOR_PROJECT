import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountVowelsConsonantsTest {
    @Test void testCount() {
        assertArrayEquals(new int[]{2,3}, CountVowelsConsonants.count("Hello"));
        assertArrayEquals(new int[]{0,0}, CountVowelsConsonants.count(""));
        assertArrayEquals(new int[]{1,0}, CountVowelsConsonants.count("a"));
    }
}