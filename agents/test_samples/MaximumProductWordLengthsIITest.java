import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProductWordLengthsIITest {
    @Test
    void testMaxProduct() {
        assertEquals(16, MaximumProductWordLengthsII.maxProduct(new String[]{"abcw","baz","foo","bar","xtfn","abcdef"})); // fails
    }
}