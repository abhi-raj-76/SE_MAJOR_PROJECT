import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecimalMultiplierTest {
    @Test
    void testMultiply() {
        DecimalMultiplier d = new DecimalMultiplier();
        assertEquals(12.0, d.multiply(3,4));
    }
}