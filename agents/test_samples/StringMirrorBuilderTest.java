import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringMirrorBuilderTest {
    @Test
    void testMirror() {
        StringMirrorBuilder s = new StringMirrorBuilder();
        assertEquals("abccba", s.mirror("abc"));
    }
}