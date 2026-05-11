import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterVTest {
    @Test
    void testMaxArea() {
        ContainerWithMostWaterV solver = new ContainerWithMostWaterV();
        assertEquals(49, solver.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(1, solver.maxArea(new int[]{1,1}));
        assertEquals(0, solver.maxArea(new int[]{}));
    }
}