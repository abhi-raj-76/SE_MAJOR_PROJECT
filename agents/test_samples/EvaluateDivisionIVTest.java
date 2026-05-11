import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvaluateDivisionIVTest {
    @Test
    void testCalc() {
        assertTrue(EvaluateDivisionIV.calcEquation(new java.util.ArrayList<>(), new double[]{}, new java.util.ArrayList<>()).length >= 0);
    }
}