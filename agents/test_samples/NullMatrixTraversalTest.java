import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NullMatrixTraversalTest {
    @Test
    void testMatrix() {
        NullMatrixTraversal n =
                new NullMatrixTraversal();

        assertEquals(
                10,
                n.total(
                        new int[][]{
                                {1,2},
                                {3,4}
                        }
                )
        );
    }

    @Test
    void testEmpty() {
        NullMatrixTraversal n =
                new NullMatrixTraversal();

        assertEquals(
                0,
                n.total(new int[][]{})
        );
    }

    @Test
    void testNull() {
        NullMatrixTraversal n =
                new NullMatrixTraversal();

        assertThrows(
                NullPointerException.class,
                () -> n.total(null)
        );
    }
}