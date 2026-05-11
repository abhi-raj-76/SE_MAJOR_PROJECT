import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class WordLadderIIVTest {
    @Test
    void testLadder() {
        WordLadderIIV solver = new WordLadderIIV();
        List<String> list = Arrays.asList("hot","dot","dog","lot","log","cog");
        assertFalse(solver.findLadders("hit", "cog", list).isEmpty());
    }
}