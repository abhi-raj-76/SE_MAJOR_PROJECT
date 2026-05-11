import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumFinderTest {
    @Test
    void testMinimum() {
        MinimumFinder m = new MinimumFinder();
        assertEquals(1, m.min(new int[]{7,1,5}));
    }
}