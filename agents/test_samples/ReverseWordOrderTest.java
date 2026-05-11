import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseWordOrderTest {
    @Test
    void testReverse() {
        ReverseWordOrder r = new ReverseWordOrder();
        assertEquals("world hello", r.reverse("hello world"));
    }
}