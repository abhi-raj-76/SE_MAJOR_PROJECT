import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingBraceUtilityTest {
    @Test
    void testSquare() {
        assertEquals(
                25,
                MissingBraceUtility.square(5)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                0,
                MissingBraceUtility.square(0)
        );
    }

    @Test
    void testNegative() {
        assertEquals(
                9,
                MissingBraceUtility.square(-3)
        );
    }
}