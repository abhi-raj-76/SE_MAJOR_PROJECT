import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AscendingOrderValidatorTest {
    @Test
    void testAscending() {
        AscendingOrderValidator a =
                new AscendingOrderValidator();

        assertTrue(
                a.isAscending(
                        new int[]{1,2,3,4}
                )
        );
    }

    @Test
    void testDescending() {
        AscendingOrderValidator a =
                new AscendingOrderValidator();

        assertFalse(
                a.isAscending(
                        new int[]{4,3,2}
                )
        );
    }
}