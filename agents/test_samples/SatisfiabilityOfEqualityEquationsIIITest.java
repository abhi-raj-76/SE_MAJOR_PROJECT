import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SatisfiabilityOfEqualityEquationsIIITest {
    @Test
    void testEquations() {
        assertTrue(SatisfiabilityOfEqualityEquationsIII.equationsPossible(new String[]{"a==b"}));
    }
}