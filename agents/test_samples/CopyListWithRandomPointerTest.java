import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CopyListWithRandomPointerTest {
    @Test
    void testCopy() {
        assertNotNull(CopyListWithRandomPointer.copyRandomList(null));
    }
}