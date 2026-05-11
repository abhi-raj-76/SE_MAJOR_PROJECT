import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoveZeroShifterTest {
    @Test
    void testMoveZeros() {
        MoveZeroShifter m = new MoveZeroShifter();
        int[] arr = {0,1,0,3,12};
        m.move(arr);
        assertArrayEquals(new int[]{1,3,12,0,0}, arr);
    }
}