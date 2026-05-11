import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignTwitterVTest {
    @Test
    void testTwitter() {
        DesignTwitterV twitter = new DesignTwitterV();
        twitter.postTweet(1, 5);
    }
}