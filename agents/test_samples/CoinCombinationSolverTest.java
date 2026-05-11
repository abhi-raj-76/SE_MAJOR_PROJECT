import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoinCombinationSolverTest {
    @Test
    void testCoinChange() {
        CoinCombinationSolver c =
                new CoinCombinationSolver();

        assertEquals(4,
                c.combinations(new int[]{1,2,5},5));
    }
}