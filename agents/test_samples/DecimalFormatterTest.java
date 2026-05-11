import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecimalFormatterTest {
    @Test
    void testFormat() {
        DecimalFormatter d = new DecimalFormatter();
        assertEquals("3.14", d.format(3.14159));
    }
}