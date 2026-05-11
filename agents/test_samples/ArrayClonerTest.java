import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayClonerTest {
    @Test
    void testClone() {
        ArrayCloner a = new ArrayCloner();
        assertArrayEquals(new int[]{1,2,3}, a.cloneArray(new int[]{1,2,3}));
    }
}