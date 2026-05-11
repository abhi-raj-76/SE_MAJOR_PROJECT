import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SatisfiabilityOfEqualityEquationsTest {
    @Test
    void testEquations() {
        assertTrue(SatisfiabilityOfEqualityEquations.equationsPossible(new String[]{"a==b","b!=a"})); // may fail
    }
}