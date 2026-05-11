import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateValueLocatorTest {
    @Test
    void testDuplicate() {
        DuplicateValueLocator d =
                new DuplicateValueLocator();

        assertTrue(
                d.containsDuplicate(
                        new int[]{1,2,3,1}
                )
        );
    }

    @Test
    void testNoDuplicate() {
        DuplicateValueLocator d =
                new DuplicateValueLocator();

        assertFalse(
                d.containsDuplicate(
                        new int[]{1,2,3,4}
                )
        );
    }

    @Test
    void testSingle() {
        DuplicateValueLocator d =
                new DuplicateValueLocator();

        assertFalse(
                d.containsDuplicate(
                        new int[]{7}
                )
        );
    }
}