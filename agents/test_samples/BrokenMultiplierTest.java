import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenMultiplierTest {

    @Test
    void testMultiply() {
        BrokenMultiplier b =
                new BrokenMultiplier();

        assertEquals(12, b.multiply(3,4));
    }
}