import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotatedArrayMinimumFinderTest {
    @Test
    void testFindMinimum() {
        RotatedArrayMinimumFinder r =
                new RotatedArrayMinimumFinder();

        assertEquals(1,
                r.find(new int[]{3,4,5,1,2}));
    }
}