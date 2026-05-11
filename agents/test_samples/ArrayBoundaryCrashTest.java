import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayBoundaryCrashTest {
    @Test
    void testCrash() {
        ArrayBoundaryCrash a =
                new ArrayBoundaryCrash();

        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> a.access(new int[]{1,2,3})
        );
    }
}