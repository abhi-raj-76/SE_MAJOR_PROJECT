import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindKClosestElementsTest {
    @Test
    void testClosest() {
        assertEquals(java.util.List.of(1,2,3,4), FindKClosestElements.findClosestElements(new int[]{1,2,3,4,5}, 4, 3));
    }
}