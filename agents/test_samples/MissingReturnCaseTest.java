import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingReturnCaseTest {

    @Test
    void testFind() {
        MissingReturnCase m =
                new MissingReturnCase();

        assertEquals(5, m.find(5));
    }
}