import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayElementSummerTest {
    @Test
    void testSum() {
        assertEquals(
                10,
                ArrayElementSummer.sum(
                        new int[]{1,2,3,4}
                )
        );
    }

    @Test
    void testZero() {
        assertEquals(
                0,
                ArrayElementSummer.sum(
                        new int[]{}
                )
        );
    }

    @Test
    void testNegative() {
        assertEquals(
                -6,
                ArrayElementSummer.sum(
                        new int[]{-1,-2,-3}
                )
        );
    }
}