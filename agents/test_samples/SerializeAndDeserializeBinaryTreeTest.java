import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SerializeAndDeserializeBinaryTreeTest {
    @Test
    void testSerialize() {
        assertNotNull(new SerializeAndDeserializeBinaryTree().serialize(null));
    }
}