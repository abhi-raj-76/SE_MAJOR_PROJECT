import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateLettersTest {
    @Test
    void testRemove() {
        assertEquals("abc", RemoveDuplicateLetters.removeDuplicateLetters("bcabc"));
    }
}