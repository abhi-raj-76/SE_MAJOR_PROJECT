import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCharacterCrashTest {
    @Test
    void testCrash() {
        StringCharacterCrash s =
                new StringCharacterCrash();

        assertThrows(
                StringIndexOutOfBoundsException.class,
                () -> s.get("java")
        );
    }

    @Test
    void testAnotherCrash() {
        StringCharacterCrash s =
                new StringCharacterCrash();

        assertThrows(
                StringIndexOutOfBoundsException.class,
                () -> s.get("")
        );
    }

    @Test
    void testShortString() {
        StringCharacterCrash s =
                new StringCharacterCrash();

        assertThrows(
                StringIndexOutOfBoundsException.class,
                () -> s.get("hi")
        );
    }
}