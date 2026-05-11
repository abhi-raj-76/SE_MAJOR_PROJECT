import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SerializeBinaryTreeTest {
    @Test
    void testSerialize() {
        assertNotNull(SerializeBinaryTree.serialize(null));
    }
}