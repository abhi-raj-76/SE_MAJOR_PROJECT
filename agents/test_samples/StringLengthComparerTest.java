import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringLengthComparerTest {
    @Test
    void testLonger() {
        StringLengthComparer s = new StringLengthComparer();
        assertTrue(s.longer("java","go"));
    }
}