import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidMountainArrayCheckerTest {
    @Test void testMountain() {
        assertTrue(ValidMountainArrayChecker.validMountainArray(new int[]{0,3,2,1}));
        assertFalse(ValidMountainArrayChecker.validMountainArray(new int[]{3,5,5}));
        assertFalse(ValidMountainArrayChecker.validMountainArray(new int[]{0,1,2,3}));
        assertFalse(ValidMountainArrayChecker.validMountainArray(new int[]{3,2,1}));
    }
}

// Class: ExcelColumnTitleGenerator
// Status: BUGGY