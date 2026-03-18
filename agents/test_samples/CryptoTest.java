import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CryptoTest {

    @Test
    public void testVerifySignature() {
        byte[] message = "Hello World!".getBytes();
        byte[] signature = "This is a test signature".getBytes();
        PublicKey pubKey = null;

        assertTrue(Crypto.verifySignature(pubKey, message, signature));
    }
}