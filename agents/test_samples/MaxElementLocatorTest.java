import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxElementLocatorTest {
    @Test
    void testMax() {
        MaxElementLocator m =
                new MaxElementLocator();

        assertEquals(
                9,
                m.max(new int[]{1,9,3})
        );
    }

    @Test
    void testNegative() {
        MaxElementLocator m =
                new MaxElementLocator();

        assertEquals(
                -1,
                m.max(new int[]{-5,-1,-7})
        );
    }
}