import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProductWordLengthsTest {
    @Test
    void testMaxProduct() {
        assertEquals(16, MaximumProductWordLengths.maxProduct(new String[]{"abcw","baz","foo","bar","xtfn","abcdef"})); // fails
    }
}