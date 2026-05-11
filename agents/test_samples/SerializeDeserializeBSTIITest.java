import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SerializeDeserializeBSTIITest {
    @Test
    void testSerialize() {
        assertNotNull(new SerializeDeserializeBSTII().serialize(null));
    }
}