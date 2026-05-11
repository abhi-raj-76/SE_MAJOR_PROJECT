import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryMatrixSearcherTest {
    @Test
    void testFound() {
        BinaryMatrixSearcher b =
                new BinaryMatrixSearcher();

        assertTrue(
                b.search(
                        new int[][]{
                                {1,4,7},
                                {2,5,8},
                                {3,6,9}
                        },
                        5
                )
        );
    }

    @Test
    void testNotFound() {
        BinaryMatrixSearcher b =
                new BinaryMatrixSearcher();

        assertFalse(
                b.search(
                        new int[][]{{1,2}},
                        7
                )
        );
    }

    @Test
    void testSingle() {
        BinaryMatrixSearcher b =
                new BinaryMatrixSearcher();

        assertTrue(
                b.search(
                        new int[][]{{10}},
                        10
                )
        );
    }
}