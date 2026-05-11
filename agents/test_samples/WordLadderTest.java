import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {
    @Test
    void testLadder() {
        java.util.List<String> list = java.util.List.of("hot","dot","dog","lot","log","cog");
        assertEquals(5, WordLadder.ladderLength("hit", "cog", list)); // fails
    }
}