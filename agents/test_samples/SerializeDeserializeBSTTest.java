import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SerializeDeserializeBSTTest {
    @Test
    void testSerialize() {
        SerializeDeserializeBST.TreeNode root = new SerializeDeserializeBST.TreeNode(2);
        assertTrue(SerializeDeserializeBST.serialize(root).startsWith("2"));
    }
}