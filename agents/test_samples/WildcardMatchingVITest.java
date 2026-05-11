import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WildcardMatchingVITest {
    @Test
    void testWildcard() {
        WildcardMatchingVI solver = new WildcardMatchingVI();
        assertTrue(solver.isMatch("aa", "*"));
    }
}