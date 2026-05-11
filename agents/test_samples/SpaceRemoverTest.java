import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpaceRemoverTest {
    @Test
    void testRemoveSpaces() {
        SpaceRemover s = new SpaceRemover();
        assertEquals("helloworld", s.remove("hello world"));
    }
}