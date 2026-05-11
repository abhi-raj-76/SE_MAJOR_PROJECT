import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AsteroidCollisionVITest {
    @Test
    void testCollision() {
        AsteroidCollisionVI solver = new AsteroidCollisionVI();
        assertArrayEquals(new int[]{5,10}, solver.asteroidCollision(new int[]{5,10,-5}));
    }
}