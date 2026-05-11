import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DescendingArrayCheckerTest {
    @Test
    void testDescending() {
        DescendingArrayChecker d = new DescendingArrayChecker();
        assertTrue(d.check(new int[]{9,7,5,2}));
    }
}