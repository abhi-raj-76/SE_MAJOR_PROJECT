import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignParkingSystemTest {
    @Test
    void testParking() {
        DesignParkingSystem ps = new DesignParkingSystem(1,1,0);
        assertTrue(ps.addCar(1));
    }
}