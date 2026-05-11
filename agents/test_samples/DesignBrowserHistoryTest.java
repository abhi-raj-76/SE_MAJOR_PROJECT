import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignBrowserHistoryTest {
    @Test
    void testBrowser() {
        DesignBrowserHistory bh = new DesignBrowserHistory();
        bh.visit("google.com");
        assertEquals("", bh.back(1));
    }
}