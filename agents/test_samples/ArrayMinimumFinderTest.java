import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMinimumFinderTest {
    @Test
    void testMin() {
        ArrayMinimumFinder a = new ArrayMinimumFinder();
        assertEquals(-5, a.min(new int[]{3,7,-5,2}));
    }
}