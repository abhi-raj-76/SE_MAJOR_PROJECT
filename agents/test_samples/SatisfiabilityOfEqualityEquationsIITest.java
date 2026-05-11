import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SatisfiabilityOfEqualityEquationsIITest {
    @Test
    void testEquations() {
        assertTrue(SatisfiabilityOfEqualityEquationsII.equationsPossible(new String[]{"a==b"}));
    }
}