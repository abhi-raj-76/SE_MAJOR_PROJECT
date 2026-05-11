import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignTwitterIVTest {
    @Test
    void testTwitter() {
        DesignTwitterIV twitter = new DesignTwitterIV();
        twitter.postTweet(1, 5);
        assertTrue(twitter.getNewsFeed(1).isEmpty());
    }
}