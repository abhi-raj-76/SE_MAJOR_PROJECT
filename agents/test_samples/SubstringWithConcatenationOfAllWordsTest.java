import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubstringWithConcatenationOfAllWordsTest {
    @Test
    void testSubstring() {
        assertEquals(0, SubstringWithConcatenationOfAllWords.findSubstring("barfoothefoobarman", new String[]{"foo","bar"}).size());
    }
}