import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerAtoiTest {
    @Test
    void testAtoi() {
        assertEquals(42, StringToIntegerAtoi.myAtoi("42")); // fails
    }
}