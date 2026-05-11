import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SerializeDeserializeBSTVITest {
    @Test
    void testSerialize() {
        SerializeDeserializeBSTVI codec = new SerializeDeserializeBSTVI();
        SerializeDeserializeBSTVI.TreeNode root = new SerializeDeserializeBSTVI.TreeNode(2);
        root.left = new SerializeDeserializeBSTVI.TreeNode(1);
        root.right = new SerializeDeserializeBSTVI.TreeNode(3);
        String s = codec.serialize(root);
        assertNotNull(codec.deserialize(s));
    }
}