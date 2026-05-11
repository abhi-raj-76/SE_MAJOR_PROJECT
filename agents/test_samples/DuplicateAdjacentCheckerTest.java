import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateAdjacentCheckerTest {
    @Test
    void testHasDuplicates() {
        DuplicateAdjacentChecker d =
                new DuplicateAdjacentChecker();

        assertTrue(
                d.hasAdjacentDuplicates(
                        new int[]{1,2,2,3}
                )
        );
    }

    @Test
    void testNoDuplicates() {
        DuplicateAdjacentChecker d =
                new DuplicateAdjacentChecker();

        assertFalse(
                d.hasAdjacentDuplicates(
                        new int[]{1,2,3}
                )
        );
    }
}