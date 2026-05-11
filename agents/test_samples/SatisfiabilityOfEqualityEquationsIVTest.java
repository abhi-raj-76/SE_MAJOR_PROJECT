import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SatisfiabilityOfEqualityEquationsIVTest {
    @Test
    void testEquations() {
        assertTrue(SatisfiabilityOfEqualityEquationsIV.equationsPossible(new String[]{"a==b"}));
    }
}