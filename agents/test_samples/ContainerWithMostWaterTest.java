import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    @Test
    void testMaxArea() {
        assertEquals(49, ContainerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // fails
    }
}