import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommaRemoverTest {
    @Test
    void testRemoveComma() {
        CommaRemover c = new CommaRemover();
        assertEquals("helloworld", c.remove("hello,world"));
    }
}