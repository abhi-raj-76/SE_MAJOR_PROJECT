import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringChunkReverserTest {
    @Test
    void testReverse() {
        StringChunkReverser s =
                new StringChunkReverser();

        assertEquals(
                "cbafed",
                s.reverseChunks("abcdef",3)
        );
    }

    @Test
    void testUneven() {
        StringChunkReverser s =
                new StringChunkReverser();

        assertEquals(
                "bacd",
                s.reverseChunks("abcd",2)
        );
    }
}