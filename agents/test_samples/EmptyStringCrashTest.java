import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmptyStringCrashTest {
    @Test
    void testFirstCharacter() {
        EmptyStringCrash e =
                new EmptyStringCrash();

        assertEquals(
                'a',
                e.first("abc")
        );
    }

    @Test
    void testEmpty() {
        EmptyStringCrash e =
                new EmptyStringCrash();

        assertThrows(
                StringIndexOutOfBoundsException.class,
                () -> e.first("")
        );
    }
}