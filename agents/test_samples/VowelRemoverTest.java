import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelRemoverTest {
    @Test
    void testRemove() {
        VowelRemover v = new VowelRemover();
        assertEquals("hll", v.remove("hello"));
    }
}