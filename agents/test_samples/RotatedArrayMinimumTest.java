import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotatedArrayMinimumTest {
    @Test
    void testMinimum() {
        RotatedArrayMinimum r =
                new RotatedArrayMinimum();

        assertEquals(
                1,
                r.minimum(
                        new int[]{4,5,6,1,2}
                )
        );
    }

    @Test
    void testSorted() {
        RotatedArrayMinimum r =
                new RotatedArrayMinimum();

        assertEquals(
                2,
                r.minimum(
                        new int[]{2,3,4}
                )
        );
    }

    @Test
    void testSingle() {
        RotatedArrayMinimum r =
                new RotatedArrayMinimum();

        assertEquals(
                9,
                r.minimum(
                        new int[]{9}
                )
        );
    }
}