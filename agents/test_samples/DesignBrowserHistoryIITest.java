import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignBrowserHistoryIITest {
    @Test
    void testBrowser() {
        DesignBrowserHistoryII bh = new DesignBrowserHistoryII();
        bh.visit("google.com");
        assertEquals("", bh.back(1));
    }
}