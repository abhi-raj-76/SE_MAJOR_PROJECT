import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenArrayRotatorTest {

    @Test
    void testRotate() {
        BrokenArrayRotator b =
                new BrokenArrayRotator();

        int[] arr = {1,2,3};

        b.rotate(arr,1);

        assertEquals(3, arr[0]);
    }
}