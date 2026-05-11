import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestNumberLocatorTest {
    @Test
    void testSmallest() {
        SmallestNumberLocator s = new SmallestNumberLocator();
        assertEquals(1, s.smallest(new int[]{5,1,7}));
    }
}