import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringDuplicateRemoverTest {
    @Test
    void testRemove() {
        StringDuplicateRemover r = new StringDuplicateRemover();
        assertEquals("ban", r.removeDuplicates("banana"));
    }
}