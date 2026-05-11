import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveAllAdjacentDuplicatesInStringTest {
    @Test
    void testRemove() {
        assertEquals("abcd", RemoveAllAdjacentDuplicatesInString.removeDuplicates("abbaca")); // fails
    }
}