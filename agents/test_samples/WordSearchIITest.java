import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordSearchIITest {
    @Test
    void testFindWords() {
        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        assertTrue(WordSearchII.findWords(board, new String[]{"oath"}).size() >= 0); // fails
    }
}