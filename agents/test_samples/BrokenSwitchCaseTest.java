import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenSwitchCaseTest {
    @Test
    void testDay() {
        BrokenSwitchCase b =
                new BrokenSwitchCase();

        assertEquals(
                "Monday",
                b.getDay(1)
        );
    }
}