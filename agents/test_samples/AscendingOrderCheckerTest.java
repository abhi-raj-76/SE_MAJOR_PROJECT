import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AscendingOrderCheckerTest {
    @Test
    void testAscending() {
        AscendingOrderChecker a = new AscendingOrderChecker();
        assertTrue(a.check(new int[]{1,2,3,4}));
    }
}