import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterRemoverTest {
    @Test
    void testRemove() {
        CharacterRemover c = new CharacterRemover();
        assertEquals("heo", c.remove("hello",'l'));
    }
}