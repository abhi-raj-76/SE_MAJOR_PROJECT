import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OnesAndZeroesIITest {
    @Test
    void testMaxForm() {
        assertEquals(4, OnesAndZeroesII.findMaxForm(new String[]{"10","0001","111001","1","0"}, 5, 3));
    }
}