import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrimBSTTest {
    @Test
    void testTrim() {
        assertNull(TrimBST.trimBST(null, 1, 2));
    }
}