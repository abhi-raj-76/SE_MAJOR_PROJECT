import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultipleCheckerTest {
    @Test
    void testMultiple() {
        MultipleChecker m = new MultipleChecker();
        assertTrue(m.multiple(10,5));
    }
}