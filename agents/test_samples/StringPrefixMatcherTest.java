import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringPrefixMatcherTest {
    @Test
    void testStartsWith() {
        StringPrefixMatcher s = new StringPrefixMatcher();
        assertTrue(s.starts("coding","cod"));
    }
}