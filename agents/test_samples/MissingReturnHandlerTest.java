import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingReturnHandlerTest {

    @Test
    void testAdd() {
        MissingReturnHandler m =
                new MissingReturnHandler();

        assertEquals(5, m.add(2,3));
    }
}