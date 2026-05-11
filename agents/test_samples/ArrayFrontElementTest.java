import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayFrontElementTest {
    @Test
    void testFirst() {
        ArrayFrontElement a = new ArrayFrontElement();
        assertEquals(5, a.first(new int[]{5,7,9}));
    }
}