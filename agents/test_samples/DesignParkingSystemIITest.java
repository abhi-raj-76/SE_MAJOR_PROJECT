import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignParkingSystemIITest {
    @Test
    void testParking() {
        DesignParkingSystemII ps = new DesignParkingSystemII(1,1,0);
        assertTrue(ps.addCar(1));
    }
}