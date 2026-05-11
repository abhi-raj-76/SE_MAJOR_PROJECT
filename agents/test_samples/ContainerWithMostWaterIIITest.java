import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterIIITest {
    @Test
    void testMaxArea() {
        assertEquals(49, ContainerWithMostWaterIII.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // fails
    }
}