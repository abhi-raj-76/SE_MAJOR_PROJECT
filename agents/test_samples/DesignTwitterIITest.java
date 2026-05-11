import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignTwitterIITest {
    @Test
    void testTwitter() {
        DesignTwitterII twitter = new DesignTwitterII();
        twitter.postTweet(1, 5);
        assertTrue(twitter.getNewsFeed(1).isEmpty());
    }
}