import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateArrayIVTest {
    @Test
    void testRotate() {
        int[] arr = {1,2,3,4,5,6,7};
        RotateArrayIV.rotate(arr, 3);
    }
}