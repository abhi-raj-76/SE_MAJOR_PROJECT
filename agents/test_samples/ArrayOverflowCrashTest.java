import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOverflowCrashTest {
    @Test
    void testCrash() {
        ArrayOverflowCrash a =
                new ArrayOverflowCrash();

        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> a.fetch(new int[]{1,2,3})
        );
    }

    @Test
    void testAnotherCrash() {
        ArrayOverflowCrash a =
                new ArrayOverflowCrash();

        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> a.fetch(new int[]{9})
        );
    }

    @Test
    void testEmpty() {
        ArrayOverflowCrash a =
                new ArrayOverflowCrash();

        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> a.fetch(new int[]{})
        );
    }
}