import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharacterRemoverTest {

    @Test
    void testRemove() {
        DuplicateCharacterRemover d =
                new DuplicateCharacterRemover();

        assertEquals("abc",
                d.remove("aabbcc"));
    }

    @Test
    void testSingle() {
        DuplicateCharacterRemover d =
                new DuplicateCharacterRemover();

        assertEquals("z",
                d.remove("z"));
    }
}