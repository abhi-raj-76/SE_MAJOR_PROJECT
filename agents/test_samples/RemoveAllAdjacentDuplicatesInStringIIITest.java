import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveAllAdjacentDuplicatesInStringIIITest {
    @Test
    void testRemove() {
        assertEquals("abcd", RemoveAllAdjacentDuplicatesInStringIII.removeDuplicates("abbaca")); // fails
    }
}