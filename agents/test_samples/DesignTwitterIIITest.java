import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignTwitterIIITest {
    @Test
    void testTwitter() {
        DesignTwitterIII twitter = new DesignTwitterIII();
        twitter.postTweet(1, 5);
    }
}