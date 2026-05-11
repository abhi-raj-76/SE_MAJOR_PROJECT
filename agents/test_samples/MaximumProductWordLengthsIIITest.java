import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProductWordLengthsIIITest {
    @Test
    void testMaxProduct() {
        assertEquals(16, MaximumProductWordLengthsIII.maxProduct(new String[]{"abcw","baz","foo","bar","xtfn","abcdef"})); // fails
    }
}