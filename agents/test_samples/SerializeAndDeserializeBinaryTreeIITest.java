import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SerializeAndDeserializeBinaryTreeIITest {
    @Test
    void testSerialize() {
        assertNotNull(new SerializeAndDeserializeBinaryTreeII().serialize(null));
    }
}