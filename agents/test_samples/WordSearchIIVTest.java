import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class WordSearchIIVTest {
    @Test
    void testWordSearch() {
        WordSearchIIV solver = new WordSearchIIV();
        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words = {"oath","pea","eat","rain"};
        List<String> result = solver.findWords(board, words);
        assertTrue(result.contains("oath"));
    }
}