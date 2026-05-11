import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveAllAdjacentDuplicatesInStringIITest {
    @Test
    void testRemove() {
        assertEquals("abcd", RemoveAllAdjacentDuplicatesInStringII.removeDuplicates("deeedbbcccbdaa", 3));
    }
}