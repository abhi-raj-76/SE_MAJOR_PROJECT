import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignTwitterVITest {
    @Test
    void testTwitter() {
        DesignTwitterVI twitter = new DesignTwitterVI();
        twitter.postTweet(1, 5);
    }
}