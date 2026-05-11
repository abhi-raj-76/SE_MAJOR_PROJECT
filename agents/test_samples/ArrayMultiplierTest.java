import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMultiplierTest {
    @Test
    void testMultiply() {
        ArrayMultiplier a = new ArrayMultiplier();
        assertEquals(24, a.multiply(new int[]{2,3,4}));
    }
}