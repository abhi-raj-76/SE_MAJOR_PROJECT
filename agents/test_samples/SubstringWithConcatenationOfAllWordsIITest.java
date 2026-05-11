import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubstringWithConcatenationOfAllWordsIITest {
    @Test
    void testSubstring() {
        assertEquals(0, SubstringWithConcatenationOfAllWordsII.findSubstring("", new String[]{}).size());
    }
}