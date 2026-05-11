import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterAsciiFinderTest {
    @Test
    void testAscii() {
        CharacterAsciiFinder c = new CharacterAsciiFinder();
        assertEquals(65, c.ascii('A'));
    }
}