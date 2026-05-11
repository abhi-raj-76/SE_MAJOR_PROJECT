import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HexToDecimalParserTest {
    @Test
    void testParse() {
        HexToDecimalParser h = new HexToDecimalParser();
        assertEquals(255, h.parse("FF"));
    }
}