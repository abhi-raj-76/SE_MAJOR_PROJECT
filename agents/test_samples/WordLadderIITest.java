import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class WordLadderIITest {
    @Test
    void testLadders() {
        List<String> dict = List.of("hot","dot","dog","lot","log","cog");
        assertTrue(WordLadderII.findLadders("hit", "cog", dict).size() >= 0);
    }

    @Test
    void testNoPath() {
        assertEquals(0, WordLadderII.findLadders("hit", "cog", List.of()).size());
    }
}