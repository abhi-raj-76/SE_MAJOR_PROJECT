import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StepByStepDirectionsFromBinaryTreeNodeToAnotherTest {
    @Test
    void testDirections() {
        assertNotNull(StepByStepDirectionsFromBinaryTreeNodeToAnother.getDirections(null, 1, 2));
    }
}