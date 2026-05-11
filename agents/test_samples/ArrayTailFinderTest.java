import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayTailFinderTest {
    @Test
    void testLastElement() {
        ArrayTailFinder a = new ArrayTailFinder();
        assertEquals(7, a.last(new int[]{2,4,7}));
    }
}