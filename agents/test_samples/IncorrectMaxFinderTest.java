import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncorrectMaxFinderTest {
    @Test
    void testPositive() {
        assertEquals(
                9,
                IncorrectMaxFinder.max(
                        new int[]{1,9,3}
                )
        );
    }

    @Test
    void testNegative() {
        assertEquals(
                -1,
                IncorrectMaxFinder.max(
                        new int[]{-5,-1,-7}
                )
        );
    }

    @Test
    void testMixed() {
        assertEquals(
                4,
                IncorrectMaxFinder.max(
                        new int[]{-1,4,2}
                )
        );
    }
}