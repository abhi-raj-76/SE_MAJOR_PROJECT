import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {
    @Test
    void testMove() {
        int[] arr = {0,1,0,3,12};
        MoveZeroes.moveZeroes(arr);
        assertArrayEquals(new int[]{1,3,12,0,0}, arr); // fails
    }
}