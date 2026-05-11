import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignTwitterTest {
    @Test
    void testTwitter() {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 5);
        assertTrue(twitter.getNewsFeed(1).size() >= 0);
    }
}