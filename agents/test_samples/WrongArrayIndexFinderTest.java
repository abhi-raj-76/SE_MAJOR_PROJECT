import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrongArrayIndexFinderTest {
    @Test
    void testFirstEven() {
        WrongArrayIndexFinder w =
                new WrongArrayIndexFinder();

        assertEquals(
                1,
                w.firstEven(
                        new int[]{1,4,6}
                )
        );
    }

    @Test
    void testNoEven() {
        WrongArrayIndexFinder w =
                new WrongArrayIndexFinder();

        assertEquals(
                -1,
                w.firstEven(
                        new int[]{1,3,5}
                )
        );
    }
}