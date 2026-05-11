import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsPhoneTest {
    @Test
    void test23() {
        assertEquals(9, LetterCombinationsPhone.letterCombinations("23").size());
    }

    @Test
    void testEmpty() {
        assertEquals(0, LetterCombinationsPhone.letterCombinations("").size());
    }
}