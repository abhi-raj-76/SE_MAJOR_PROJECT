import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheTownJudgeTest {
    @Test
    void testJudge() {
        assertEquals(2, FindTheTownJudge.findJudge(3, new int[][]{{1,3},{2,3}})); // fails
    }
}