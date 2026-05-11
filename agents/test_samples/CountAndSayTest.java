import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {
    @Test
    void testCount() {
        assertEquals("1211", CountAndSay.countAndSay(4));
    }
}