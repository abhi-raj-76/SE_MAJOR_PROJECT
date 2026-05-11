import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterDuplicateRemoverTest {
    @Test
    void testRemove() {
        assertEquals(
                "ban",
                CharacterDuplicateRemover
                        .removeDuplicates("banana")
        );
    }

    @Test
    void testUnique() {
        assertEquals(
                "abc",
                CharacterDuplicateRemover
                        .removeDuplicates("abc")
        );
    }

    @Test
    void testEmpty() {
        assertEquals(
                "",
                CharacterDuplicateRemover
                        .removeDuplicates("")
        );
    }
}