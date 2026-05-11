import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerDividerTest {
    @Test
    void testDivide() {
        IntegerDivider i = new IntegerDivider();
        assertEquals(5, i.divide(10,2));
    }
}